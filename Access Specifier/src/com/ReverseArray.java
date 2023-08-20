package com;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {29,32,34,43,54,23};
		
		int[] arrr=isReverse(arr);
		for(int i=0;i<arrr.length;i++) {
			System.out.println( arrr[i]);
		}
	}
	static int[] isReverse(int[] x) {
		int[] c=new int[x.length];
	int j=1;
	for(int i=0;i<x.length;i++) {
		        c[i]= x[x.length-j];
		        j++;
		        
	}
	 return c;    
	}

}
