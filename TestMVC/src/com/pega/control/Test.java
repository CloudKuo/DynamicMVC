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
//		�o�̦^�Ǫ��ܷ|��mvc�䪺�Ohi.jsp
	}
	
	
	@RequestMapping("test")
	public String test() {
		System.out.println("hi");
		return "hi";
//		�o�̦^�Ǫ��ܷ|��mvc�䪺�Ohi.jsp
	}
	
//	@RequestMapping("Login")
//	public String admin(String userName , String password) {
//		System.out.println(userName+"==="+password );
//		return "login";
////		�o�̦^�Ǫ��ܷ|��mvc�䪺�Ohi.jsp
//	}
}
