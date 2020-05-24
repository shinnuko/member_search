package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.BordDao;
import com.example.demo.dto.BordDto;



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
		ArrayList<TopEventInterface> shiganorthEventList = new ArrayList<>();
		EventList = new ArrayList<>();
		// 京都北部のメンバー募集情報
		ArrayList<TopEventInterface> kyoutonorthEventList = new ArrayList<>();
		// 大阪北部のメンバー募集情報
		ArrayList<TopEventInterface> osakanorthEventList = new ArrayList<>();


		return "form";
	}
}

