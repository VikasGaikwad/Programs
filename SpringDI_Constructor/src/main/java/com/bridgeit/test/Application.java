package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dto.SampleBean;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		SampleBean sb=(SampleBean) ctx.getBean("sample");
		sb.communicate();

	}

}
