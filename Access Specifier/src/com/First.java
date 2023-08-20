package com;

public class First {

	public static void main(String[] args) {
		int[] arr= {10,20,60,50,50};
		int fbig=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fbig) {
				
				sbig=fbig;
				fbig=arr[i];
				if(arr[i]>sbig && arr[i]!=fbig){
					sbig=arr[i];

				}
			}}
		System.out.println("first biggest is:"+fbig);
		System.out.println("second biggest is:"+sbig);

	}
}







