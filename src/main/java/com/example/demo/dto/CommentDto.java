package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boards_contents")


public class CommentDto {
	// 投稿番号
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		@Column
		private int post_no;

		// 掲示板ID
		@Column
		private int board_id;

		// 投稿内容
		@Column
		private String content;
		
		// 投稿URL
		@Column
		private String href_url;


		// 投稿日時
		@Column
		private Date posted_at;

		// 投稿ユーザーID
		@Column
		private int posted_user_id;

		
		public int getpost_no() {
			return post_no;
		}

		public void setPost_no(int post_no) {
			this.post_no = post_no;
		}

		public int getBoard_id() {
			return board_id;
		}

		public void setBoard_id(int board_id) {
			this.board_id = board_id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getHref_url() {
			return href_url;
		}

		public void setHref_url(String href_url) {
			this.href_url = href_url;
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

		public void setPosted_user_id(int posted_user_id) {
			this.posted_user_id = posted_user_id;
		}
		
	}