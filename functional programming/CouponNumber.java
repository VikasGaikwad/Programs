
/*
	Coupon Numbers...
	Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates 			this random process.
	I/P -> N Distinct Coupon Number.
	Logic -> repeatedly choose a random number and check whether it's a new one.
	O/P -> total random number needed to have all distinct numbers.
	Functions => Write Class Static Functions to generate random number and to process distinct coupons.

*/
import java.util.*;
public class CouponNumber 
{
	
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=10000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}
