package com;

public class Tolowercase {

	public static void main(String[] args) {
		String str="Jairap j";
		String sty=toLowercase(str);
		System.out.println(sty);

	}
	static String toLowercase(String st) 
	{
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u' || ch[i]=='i' ||ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
				if(ch[i]>='a' && ch[i]<='z' ) {
				ch[i]=(char)(ch[i]-32);
				}
				else {
					ch[i]=ch[i];
					
				}
			
			}
			

		
		st=new String(ch);
		return st;
	}

}
