package com;

public class Swap {

	public static void main(String[] args) {
		String str="jairaj is a smart guy";
		String ste=isSwap(str);
		System.out.println(ste);
		
	}
      static String isSwap(String str) {
    	  int f=0;
    	  char[] ch=str.toCharArray();
    	  for(int i=0;i<ch.length;i++) 
    	  {
    		  if(ch[i]==0 && ch[i]!=' ' || ch[i-1]==' '&& ch[i]!=' ') 
    				  {
    			  f=i;
    				  }
    		  else {
    			  if(ch[i]!=' ' &&ch[i-1]!=' ' || ch[i+1]==' ' && ch[i]!=' ') {
    				   char temp=ch[i];
    				   ch[i]=ch[f];
    				   ch[f]=temp;
    			  }
    		  }
    	  }
      
      str=new String(ch);
    		  return str;
      }}
