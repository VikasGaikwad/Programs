package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class OurLogic
{
 public static void main(String args[])
 {
 Resource res = new ClassPathResource("spconfig.xml");
 BeanFactory factory = new XmlBeanFactory(res);
 SpringJdbcCreateTable st =(SpringJdbcCreateTable)factory.getBean("id3");
 st.createTable();
 }
}
