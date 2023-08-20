package com;

public  class Student {

	
	public static int id=10;
	public int age=22;
	public void study() {
		System.out.println("Studying java");
	}
	public static void main(String[] args) {
		System.out.println("id:"+id);
		Student s=new Student();
		System.out.println("s.age:" + s.age);
		s.study();
	}
	

	}


