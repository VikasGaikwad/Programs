package com.spring.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	
	String welcome = null;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("msg","welcome");
		
		return welcome;
		
	}
	@RequestMapping(value="helloAgain",method=RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("msg","welcome spring mvc");
		return welcome;
		
	}

}
