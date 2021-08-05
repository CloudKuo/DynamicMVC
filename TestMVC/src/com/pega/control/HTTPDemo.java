package com.pega.control;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HTTPDemo {
	private int a = 0;
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	@ResponseBody
	public String getTest() {
		a++;
		System.out.println(a);
		System.out.println("Get Demo");
		return "login";
	}
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	@ResponseBody
	public String duplicate() {
		System.out.println("Copy");
		return "login";
	}
//	不同method URL, parameters, 都代表不同的mapping 就算是同個URL 但是URI不同
	@RequestMapping(value = "/foos", method = RequestMethod.POST)
	@ResponseBody
	public String postFoos() {
		System.out.println("POST DEMO");
	    return "Post some Foos";
	}
	
	@RequestMapping(value = "/header", headers = "key=val", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosWithHeader() {
		System.out.println("get hi page with header");
	    return "hi";
	}
	
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	@ResponseBody
	public String getHiWithParam(@RequestParam("id") String personId) {
		System.out.println("get hi page with param and your id :"+personId );
	    return "hi";
	}

	@RequestMapping(value = "/json", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public String getFoosAsJsonFromBrowser() {
		System.out.println("get JSON");
		return "testJSON";
		
	}
	
	@RequestMapping(value = "/getString" ,  produces = MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody
	public ObTest getString() {
		System.out.println("enter");
		return new ObTest();
	}
	
	@RequestMapping(value = "/path/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariable(@PathVariable("id") long id) {
		System.out.println("get by path");
		return "Get a specific Foo with id=" + id;
	}
	
	@RequestMapping(value = "/ex/path/{fooid}/bar/{barid}", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariables(@PathVariable long fooid, @PathVariable long barid) {
		System.out.println("Mutliple path variable");
		return "Get a specific Bar with id=" + barid + " from a Foo with id=" + fooid;
	}
	
	
}
