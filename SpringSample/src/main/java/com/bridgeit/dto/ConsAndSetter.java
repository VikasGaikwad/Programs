package com.bridgeit.dto;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConsAndSetter {
	private int i;
	private double d;
	private String myStr;
	private Date myDate;
	private List myList;


	public ConsAndSetter() {
		System.out.println("default constructor initialized...");
	}
	public ConsAndSetter(int i,double d,String myStr,Date myDate,List myList) {
		System.out.println("parameterized constructor initialized...");
		this.i=i;
		this.d=d;
		this.myStr=myStr;
		this.myDate=myDate;
		this.myList=myList;
	}


	public void setI(int i) {
		this.i = i;
	}
	public void setD(double d) {
		this.d = d;
	}
	public void setMyStr(String myStr) {
		this.myStr = myStr;
	}
	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}
	public void setMyList(List myList) {
		this.myList = myList;
	}


	public void printPrimitives() {
		System.out.println("printing primitives...");
		System.out.println(i);
		System.out.println(d);
	}
	public void printSecondaries() {
		System.out.println("printing secondaries...");
		System.out.println(myStr);
		System.out.println(myDate);
	}
	public void printList() {
		System.out.println("printing list...");
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}

}
