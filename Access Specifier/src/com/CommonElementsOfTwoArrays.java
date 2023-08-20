package com;

public class CommonElementsOfTwoArrays {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int[] b= {20,30,10,23,49};
		int[] ar=cOMMAN0(a,b);
		for(int i=0;i<ar.length;i++) {
			System.err.println(ar[i]);
		}
	}
	static int[] cOMMAN0(int[] x,int[] y) {
		int k=0;
		int[] c=new int[y.length];
	   for(int i=0;i<x.length;i++) {
		   for(int j=0;j<y.length;j++) {
			   if(x[i]==x[j]) {
				   c[k]=x[i];
		   
			      k++;
			       break;
			   }
			      
		   }
	   }
	   int[] d=new int[k];
	   for(int i=0;i<k;i++) {
		  d[i]= c[i];
		  
	   }
	   return d;
	   }
}

