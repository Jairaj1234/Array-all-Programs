package com;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
	
		int[] ar= {10,20,24,21,23};
		for(int i=0;i<ar.length;i++) {
			boolean rs=	isPrime(ar[i]);

		
		if(rs==true) {
			count++;
		}
		
		
		}
		System.out.println(count);
				



	}





	static boolean isPrime(int n) {
		int count=0;
		boolean rss=true;

		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				rss=false;
		}
		return rss;

	}





}