package com;

public class Merge {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int[] b= {26,35,46,26,47};
		
		int[] y=sortit(a,b);
		for(int i=0;i<y.length;i++ ) {
			System.out.println(y[i]);
		}
		
	}
static int[] sortit(int[] x,int[] y) {
	int i=0,j=0,k=0;
	int[] c=new int[x.length+y.length];
	while(i<x.length &&j<y.length) {
		if(x[i]<y[j]) {
			c[k]=x[i];
			k++;
			i++;
		}
		else {
			c[k]=y[j];
			k++;
			j++;
		}
	}
		
	
	while(i<x.length)
	{
		c[k]=x[i];
		k++;
		i++;
	}
	while(j<y.length) {
		c[k]=y[j];
		j++;
		k++;
	}
	return c;
	
	
}
	
	
	
	
}
