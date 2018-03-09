package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dto.BasicInfo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
      BasicInfo object=(BasicInfo) ac.getBean("a1");
      System.out.println("**************************");
      object.printId();
      object.printName();
      object.printList();
      int k=object.getMe();
      System.out.println("**************************");
      System.out.println("cube of k is : "+Math.pow(k, 3));
    }

	
}
