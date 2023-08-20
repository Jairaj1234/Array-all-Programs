package com;

public class Digits {

	public static void main(String[] args) {
		int count=0;
	String n="jairaj123*";
	for(int i=0;i<n.length();i++) {
	char arr=n.charAt(i);
	 if ((arr >= 32 && arr <= 47) || (arr >= 58 && arr <= 64) || (arr >= 91 && arr <= 96) || (arr >= 123 && arr <= 126))  {
			count++;
		}
	}
	System.out.println(count);

}}