package com.pega.control;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//POJO class
@Controller
public class Test {
	
	@RequestMapping("hi")
	public String hi() {
		System.out.println("hi");
		return "hi";
//		這裡回傳的話會讓mvc找的是hi.jsp
	}
	
	
	@RequestMapping("test")
	public String test() {
		System.out.println("hi");
		return "hi";
//		這裡回傳的話會讓mvc找的是hi.jsp
	}
	
//	@RequestMapping("Login")
//	public String admin(String userName , String password) {
//		System.out.println(userName+"==="+password );
//		return "login";
////		這裡回傳的話會讓mvc找的是hi.jsp
//	}
}
