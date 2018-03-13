/**
 * 
 */
package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dto.CommunicationBean;

/**
 * @author vikas gaikwad
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		CommunicationBean app = (CommunicationBean) ctx.getBean("comunication");
		app.communicate();

	}

}
