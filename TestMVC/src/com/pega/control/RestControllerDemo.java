package com.pega.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	@RequestMapping("rest")
	public String restHello() {
		return "Rest Controller";
	}
}
