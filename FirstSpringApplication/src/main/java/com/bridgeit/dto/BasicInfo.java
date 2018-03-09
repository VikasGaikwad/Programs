package com.bridgeit.dto;

import java.util.Iterator;
import java.util.List;

import com.bridgeit.interfac.BasicInterface;

public class BasicInfo implements BasicInterface{
private int id;
private String name;
private List myList;


public BasicInfo() {
	
}

public BasicInfo(int id, String name, List myList) {
	super();
	this.id = id;
	this.name = name;
	this.myList = myList;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setMyList(List myList) {
	this.myList = myList;
}
public void printId() {
	System.out.println(id);
}
public void printName() {
	System.out.println(name);
}
public void printList() {
	Iterator iterator=myList.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next().toString());
	}
}
public int getMe() {
	return id;
}

public void v1() {
	System.out.println("this is implemented method...v1");
	
}
}
