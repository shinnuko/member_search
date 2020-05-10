package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="b_template")

public class LiveDto {

	// シーケンス
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		@Column
		private int sequence;

		// 地域番号
		@Column
		private int location_no;

		// 県番号
		@Column
		private int prefecture_no;

		// 募集パート
		@Column
		private String recruiment_part;

		// 場所
		@Column
		private String recruiment_place;

		// 年齢
		@Column
		private int recruiment_age;

		// 区切り文字
		@Column
		private String quota;

		// 性別
		@Column
		private String recruiment_sex;


		// 表示フラグ
		@Column
		private boolean disp_flg;


		// ジャンル名
		@Column
		private String genre;

		public int getSequence() {
			return sequence;
		}

		public void setSequence(int sequence) {
			this.sequence = sequence;
		}

		public int getLocation_no() {
			return location_no;
		}

		public void setLocation_no(int location_no) {
			this.location._no = location_no;
		}

		public int getPrefecture_no() {
			return prefecture_no;
		}

		public void setPrefecture_no(int prefecture_no) {
			this.prefecture_no = prefecture_no;
		}

		public String getRecuiment_part() {
			return recuiment_part;
		}

		public void setRecuiment_part(String recuiment_part) {
			this.recuiment_part = recuiment_part;
		}

		public String Recuiment_place() {
			return recuiment_place;
		}

		public void setRecuiment_place(String recuiment_place) {
			this.recuiment_place = recuiment_place;
		}

		public int Recuiment_age() {
			return recuiment_age;
		}

		public void setRecuiment_age(int recuiment_age) {
			this.recuiment_age = recuiment_age;
		}

		public String getQuota() {
			return quota;
		}

		public void setQuota(String quota) {
			this.quota = quota;
		}

		public String Recuiment_sex() {
			return recuiment_sex;
		}

		public void setRecuiment_sex(String recuiment_sex) {
			this.recuiment_sex = recuiment_sex;
		}


		public boolean isDisp_flg() {
			return disp_flg;
		}

		public void setDisp_flg(boolean disp_flg) {
			this.disp_flg = disp_flg;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

	}


