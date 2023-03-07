package com.tech.kimchi.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDto {

	private String user_id;
	private String user_pw;
	private String user_sha;
	private String user_rsa;
	private String user_name;
	private String user_tel;
	private String user_nickname;
	private String user_email;
	private String user_grade;
	private int user_age;
	private String user_gender;
	private int user_cash;
	private String user_filesrc;
	private Date user_date;

	public UserInfoDto() {
		// TODO Auto-generated constructor stub
	}

	public UserInfoDto(String user_id, String user_pw, String user_sha, String user_rsa, String user_name,
			String user_tel, String user_nickname, String user_email, String user_grade, int user_age,
			String user_gender, int user_cash, String user_filesrc, Date user_date) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_sha = user_sha;
		this.user_rsa = user_rsa;
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.user_nickname = user_nickname;
		this.user_email = user_email;
		this.user_grade = user_grade;
		this.user_age = user_age;
		this.user_gender = user_gender;
		this.user_cash = user_cash;
		this.user_filesrc = user_filesrc;
		this.user_date = user_date;
	}
		
}
