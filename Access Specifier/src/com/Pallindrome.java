package com;

public class Pallindrome {

	public static void main(String[] args) {
		int count=0;
		int[] ar= {10,30,21,34,98,38};
		for(int i=0;i<ar.length;i++) {
			boolean rs=isPallindrome1(ar[i]);
			
			if(rs==true) {
				count++;
		}
			
		
			
		}
		System.out.println(count);
	}

	
	static boolean isPallindrome1(int n) {
		int rev=0; int sum=0;
		do {
			int d=n%10;
			rev=rev*10+n;
			n=n/10;
		}while(n!=0);
		if(rev==n);
		return true;
		
	}
	
	
	
}
