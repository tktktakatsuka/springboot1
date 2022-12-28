package com.example.demo.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		//hello.htmlの呼び出し
		return "Hello";
	}
}
