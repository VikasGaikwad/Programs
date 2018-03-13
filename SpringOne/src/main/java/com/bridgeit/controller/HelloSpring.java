package com.bridgeit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloSpring extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		
		ModelAndView mav=new ModelAndView("HelloWorldPage");
		mav.addObject("msg","helloworld");
		return mav;
	}




}
