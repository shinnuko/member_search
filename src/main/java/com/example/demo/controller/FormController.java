package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.BordDao;
import com.example.demo.dto.BordDto;
import com.example.demo.frontinterface.FormContentInterface;




@Controller

public class FormController {

	// 各掲示板の番号を定義
		int SHIGA_NORTH_NO = 0;
		int KYOTO_NORTH_NO = 1;
		int OSAKA_NORTH_NO = 2;


		@Autowired
		private BordDao bordDao;

	@RequestMapping("/")
	public String form(Model model) {

		// ① DB よりイベントの情報を取得する
		// 掲示板の投稿内容を取得する
		List<BordDto> bordInfoList = bordDao.findAll();


		// ② トップに出す滋賀北部、京都北部、大阪北部のイベント情報を保持するリストを作成する
		// 滋賀北部のメンバー募集情報
		ArrayList<FormContentInterface> shiganorthContentList = new ArrayList<>();

		// 京都北部のメンバー募集情報
		ArrayList<FormContentInterface> kyotonorthContentList = new ArrayList<>();

		// 大阪北部のメンバー募集情報
		ArrayList<FormContentInterface> osakanorthContentList = new ArrayList<>();


		// ③ 取得したイベント情報をもとに②で作成したリストに格納
		for(BordDto bord:bordInfoList) {

			// ⑥ ②で作成したリストに追加する用の FormContentInterface のインスタンスを生成
			    FormContentInterface content = new FormContentInterface();

			    // ⑦ 各値を設定していく
				content.setContenttUrl("http://localhost:8080/info?eventcd=" + bord.getpost_no());
				content.setContentName(bord.getContent());


				// 日付を 月/日 のフォーマットに変換
				SimpleDateFormat sdf = new SimpleDateFormat("GGGGy年 M月 d日 (E) a h時 m分 s秒");
				content.setContentDate(sdf.format(bord.getPosted_at()));
			if(bord.getBord_id() == SHIGA_NORTH_NO) {
				shiganorthContentList.add(content);
			} else if (bord.getBord_id() == KYOTO_NORTH_NO) {
				kyotonorthContentList.add(content);
			} else {
				osakanorthContentList.add(content);
			}
		}

		// ④ HTML（フロント）に渡す
		model.addAttribute("shiganorthList", shiganorthContentList);
		model.addAttribute("kyotonorthList", kyotonorthContentList);
		model.addAttribute("osakanorthList", osakanorthContentList);

		// ⑤ 表示するHTML を選択
		return "form";
	}
}

