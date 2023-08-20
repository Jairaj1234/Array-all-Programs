package com;

public class StrongNumber {

	public static void main(String[] args) {
		int i=145;
		boolean rs=isStrong(i);
		if(rs)
			System.out.println("strong number");
			
	
		else
			System.out.println("not a strong number");
	}
	static boolean isStrong(int x) {
	int temp=x;
	
		int sum=0;
	    do {
		int d=x%10;
		sum=sum+isFact(d);
		x=x/10;
	}while(x!=0);
	return(sum==temp);
		

	}	static int isFact(int f) {
		
		for(int i=1;i<=f;i++)
			[]
			f=f*i;
		}
		return f;
	}}


