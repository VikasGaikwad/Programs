package com.bridgeit.dto;

import com.bridgeit.interfac.Shape;

public class Triangle implements Shape

{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		System.out.println("Drawing Triangle...");
		System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
		System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
		


	}

}
