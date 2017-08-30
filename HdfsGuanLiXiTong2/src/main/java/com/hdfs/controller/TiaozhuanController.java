package com.hdfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TiaozhuanController {
	
	@RequestMapping("tiaozhuan")
	public String tiaozhuan(){
		return "index";
		
	}

}
