package com.biz.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/naver")
public class NaverController {

	@RequestMapping(value = "/naver.json",method = RequestMethod.GET)
	public String naver_json() {
		
	}
}
