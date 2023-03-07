package com.tech.kimchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.kimchi.service.KimchiServiceInter;

@Controller
public class UserInfoController {

	KimchiServiceInter kimchiServiceInter;
	
	@RequestMapping("/UserInfo/loginView")
	public String loginView() {
		System.out.println("UserInfoController/loginView");
		return "/UserInfo/loginView";
	}
}
