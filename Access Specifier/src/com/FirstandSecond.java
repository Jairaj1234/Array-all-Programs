package com;

public class FirstandSecond {

	public static void main(String[] args) {
		int[] ar= {10,20,30,20};
		int fbig=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			         if(ar[i]>fbig) {
			        	       
			        	       sbig=fbig;
			        	       fbig=ar[i];
			        	       
			        	       
			        	       }
			         
		}
System.out.println("first biggest is: "+fbig);
System.out.println("second biggest is: "+sbig);
	}
}
