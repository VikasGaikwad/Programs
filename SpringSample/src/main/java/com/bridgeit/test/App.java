package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dto.ConsAndSetter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
       
       ConsAndSetter object=(ConsAndSetter) context.getBean("a");
       object.printPrimitives();
       object.printSecondaries();
       object.printList();
       
       ConsAndSetter setterObj=(ConsAndSetter) context.getBean("b");
       setterObj.printPrimitives();
       setterObj.printSecondaries();
       setterObj.printList();
      
    }
}
