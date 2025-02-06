package com.kh.object.ex4;

public class StudentEasy {
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	
	public StudentEasy(String name, int age, int math, int eng, int kor) {
		super();
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}


	public StudentEasy() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	@Override
	public String toString() {
		return "StudentEasy [name=" + name 
				+ ", age=" + age 
				+ ", math=" + math 
				+ ", eng=" + eng 
				+ ", kor=" + kor + "]";
	}
	
	// 생성자 자동완성 : Alt + Shift + s 이후 o
	// 체크 해제하고 만들어볼것
	// 메소드 getter/setter 자동완성 : Alt + Shift + s -> R 
	
	// toString() -> alt + shift + s -> s
	
	// *모든 과목의 평균을 계산하는 메소드
	
	}


