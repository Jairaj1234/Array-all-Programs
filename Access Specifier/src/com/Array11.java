package com;

public class Array11 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,32};
		int[] b= {29,46,34,24};
		int[] x=main(a,b);

for(int i=0;i<x.length;i++) {
	System.out.println(x[i]);
}
	}
		static int[] main(int[] x,int[] y) {
		
		int[] c=new int[x.length+y.length];
		
		{
			int j=0; int i=0;
			while(i<x.length && i<y.length) {
				c[j]=x[i];
				j++;
				c[j]=y[i];
				j++;
				i++;
			}

				
				
				
				}
			
			return c;


			}

		}

	
