package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestSSH {
	private static String SUCCESS = "success";

	@RequestMapping("/springMVC")
	public String testSprintMVC() {
		System.out.println("test spring MVC");
		return SUCCESS;
	}

	public TestSSH() {
		System.out.println("Init testSSH...");
	}



	public void init() {
	}

	public void dev() {
	}

	public void t() {
	}

	public void tt() {
		System.out.println("Hello");
	}




}
