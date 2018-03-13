package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.interfac.Shape;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
		
		
		/*Shape shape = (Shape) context.getBean("circle");
		shape.draw();*/
	}

}
