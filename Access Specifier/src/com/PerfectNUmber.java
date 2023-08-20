package com;

public class PerfectNUmber {

	public static void main(String[] args) {
   boolean rs;
   int n=10;
   int count=0;
   for(int i=0;n>0;i++) {
				 rs=isPerfectNumber(i);
		
		if(rs) {
			System.out.println(i);
		n--;
			
		}
		}
	}
	
	static boolean isPerfectNumber(int a){
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) 
			{
				sum=sum+i;
			}
			
		}
		if(sum==a)
			return true;
		else
			return false;
	}

}
