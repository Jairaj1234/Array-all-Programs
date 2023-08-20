package com;

public class SmallestElement {

	public static void main(String[] args) {
		int[] ar= {11,30,2,38};
		
            int small=isSmall(ar);
            System.out.println("smallest element in array is:"+small);
	}
	static int isSmall(int[] ar) {
		int small=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<ar[0])
				small=ar[i];
		}
		return small;
	}

}
