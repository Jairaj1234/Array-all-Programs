package com;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
			int n=sc.nextInt();
		
	
	boolean rs=divisor(n);
	if(rs==true) {
		System.out.println("is perfect number");
	
	}
	else {
           System.out.println("not a perfcet no");
	}
	}
	static boolean divisor(int x) {
		int sum=0;
		for(int i=1;i<x/2;i++) {
			if(x%i) {
				return false;
			}
			
		}
		return true;
	}}


