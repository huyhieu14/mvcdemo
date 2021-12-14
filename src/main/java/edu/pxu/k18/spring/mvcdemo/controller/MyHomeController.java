package edu.pxu.k18.spring.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pxu.k18.spring.mvcdemo.model.User;

@Controller
public class MyHomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/hello")
	public String hello(Model model) {
		User user = new User();
		user.setFullName("HuyHieu");
		model.addAttribute("myuser", user);
		return "hello";
	}
}
