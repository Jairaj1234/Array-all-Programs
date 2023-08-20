package com;

public class Sumof {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,23,12};
		int sum=sumArray(arr);
		System.out.println(sum);
		
	}
	  static int sumArray(int[] ar) {
		  int sum=0;
		  for(int i=0;i<ar.length;i++) {
			  sum=sum+ar[i];		  }
	  
	  return sum;
	

}
}