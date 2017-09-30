package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taobao.service.PlanPhone;

@Controller
public class PlanPhoneController {
	@Autowired
	private PlanPhone PlanPhone;
	
	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insert(String path){
		int select = PlanPhone.select(path);
		return "1";
	}
}
