package com.kh.object.ex5;

public class Run {

	public static void main(String[] args) {
		System.out.println("count : " + Person.count);
		Person p1 = new Person();
		p1.name = "홍길동"; //접근가능하다. 변수들의 접근제한자가 default이기 때문에 같은 패키지내에 있으므로 각 변수에 접근 가능하다
		p1.age = 20;
		
		System.out.println(p1.toString());
		
		Person p2 = new Person("아이유", 30);
		System.out.println(p2.toString());
		
		System.out.println("Math.PI : " + Math.PI);
		System.out.println("Math.random() : " + Math.random());
		
		Person p3 = new Person("이효리", 45);
		System.out.println(p3.toString());
		
		Person p4 = new Person("한가인", 43);
		System.out.println(p4.toString());
	}

}
