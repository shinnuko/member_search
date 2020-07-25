package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.BoardDao;
import com.example.demo.dto.BoardDto;
import com.example.demo.frontinterface.FormContentInterface;




@Controller

public class FormController {

	// 各掲示板の番号を定義
		int SHIGA_SOUTH_NO = 1;
		int KYOTO_SOUTH_NO = 3;
		int OSAKA_SOUTH_NO = 5;


		@Autowired
		private BoardDao boardDao;

	@RequestMapping("/")
	public String form(Model model) {

		// ① DB よりイベントの情報を取得する
		// 掲示板の投稿内容を取得する
		List<BoardDto> boardInfoList = boardDao.findAll();


		// ② トップに出す滋賀南部、京都南部、大阪南部のイベント情報を保持するリストを作成する
		// 滋賀南部のメンバー募集情報
		ArrayList<FormContentInterface> shigasouthContentList = new ArrayList<>();

		// 京都南部のメンバー募集情報
		ArrayList<FormContentInterface> kyotosouthContentList = new ArrayList<>();

		// 大阪南部のメンバー募集情報
		ArrayList<FormContentInterface> osakasouthContentList = new ArrayList<>();


		// ③ 取得したイベント情報をもとに②で作成したリストに格納
		for(BoardDto board:boardInfoList) {

			// ⑥ ②で作成したリストに追加する用の FormContentInterface のインスタンスを生成
			    FormContentInterface content = new FormContentInterface();

			    // ⑦ 各値を設定していく
				content.setContentUrl("http://localhost:8080/info?contentcd=" + board.getpost_no());
                content.setContentName(board.getContent());
				// 日付を 月/日 のフォーマットに変換
				SimpleDateFormat sdf = new SimpleDateFormat("GGGGy年 M月 d日 (E) a h時 m分 s秒");
				content.setContentDate(sdf.format(board.getPosted_at()));
			if(board.getBoard_id() == SHIGA_SOUTH_NO) {
				shigasouthContentList.add(content);
			} else if (board.getBoard_id() == KYOTO_SOUTH_NO) {
				kyotosouthContentList.add(content);
			} else {
				osakasouthContentList.add(content);
			}
		}

		// ④ HTML（フロント）に渡す
		model.addAttribute("shigasouthcontentList", shigasouthContentList);
		model.addAttribute("kyotosouthcontentList", kyotosouthContentList);
		model.addAttribute("osakasouthcontentList", osakasouthContentList);

		// ⑤ 表示するHTML を選択
		return "form";
	}
}

