package com.example.demo.frontinterface;

public class FormContentInterface {

	// イベント詳細URL
    private String ContenttUrl;


	// 日付表示
	private String ContentDate;

	// 投稿タイトル
	private String ContentName;
	
	// 文言
    private String info;

	
	public void setInfo(String info) {
		this.info = info;
	}

	public String getContenttUrl() {
		return ContenttUrl;
	}

	public void setContenttUrl(String contenttUrl) {
		ContenttUrl = contenttUrl;
	}

	public String getContentDate() {
		return ContentDate;
	}

	public void setContentDate(String contentDate) {
		ContentDate = contentDate;
	}

	public String getContentName() {
		return ContentName;
	}

	public void setContentName(String contentName) {
		ContentName = contentName;
	}

	public String getInfo() {
		return info;
	}

	

}