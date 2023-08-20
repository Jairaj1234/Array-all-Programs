package com;

public class CommonArrayElements {
	public static void main(String[] args) {
		int[] a= {10,20,30,20};
		int[] b= {20,30,20,20};
		int[] c=isCommon(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}
	static int[] isCommon(int[] a,int[] b) 
	{int k=0;
	int[] c=new int[a.length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				c[k]=a[i];
				k++;
			}
			break;

			}
	}

	int[] z=new int[k];
	for(int i=0;i<k;i++) {
		z[i]=c[i];
	}
	return z;
	}

}
