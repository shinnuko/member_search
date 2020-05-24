package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="board_contents")
public class BordDto {

	// 投稿番号
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column
	private int post_no;

	// 掲示板ID
	@Column
	private int bord_id;

	// 投稿内容
	@Column
	private String content;


	// 投稿日時
	@Column
	private Date posted_at;

	// 投稿ユーザーID
	@Column
	private Date posted_user_id;

	
	public int getpost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public int getBord_id() {
		return bord_id;
	}

	public void setBord_id(int bord_id) {
		this.bord_id = bord_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public Date getPosted_at() {
		return posted_at;
	}

	public void setPosted_at(Date posted_at) {
		this.posted_at = posted_at;
	}
	
	public Date getPosted_user_id() {
		return posted_at;
	}

	public void setPosted_user_id(Date posted_user_id) {
		this.posted_user_id = posted_user_id;
	}
	
}