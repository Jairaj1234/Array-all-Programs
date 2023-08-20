package com;

public class Insert {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,30};
		int[] b= {10,30,20,40};
		int[] update=iNSERT(a,b,2);
		for(int i=0;i<update.length;i++) {
			System.out.println(update[i]);
		}
		
	}
		
		
		
		
		static int[] iNSERT(int[] x,int[] y,int in) {
			
		
		int[] c=new int[x.length+y.length];
		for(int i=0;i<y.length;i++) {
		c[in+i]=y[i];
		}
		for(int i=0;i<x.length;i++) {
			      if(i<in)
			      c[i]=x[i];
			      else
			    	  c[i+y.length]=x[i];
		}
		
	return c;	
	}
		
}
