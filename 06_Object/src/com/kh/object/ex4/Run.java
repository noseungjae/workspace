package com.kh.object.ex4;

public class Run {

	public static void main(String[] args) {
		Student s1 = new Student("윤석준", 20, 80, 70, 90);
		Student s2 = new Student("장원일", 19, 70, 100, 90);
		
	System.out.println(s1.getName() + "학생의 평균 : " + s1.getAvg());
	System.out.println(s2.getName() + "학생의 평균 : " + s2.getAvg());
	
		Student s3 = new Student("노승재", 36, 80, 85, 90);
		
	System.out.println("이름 : " + s3.getName() + "\n" + "나이 : " + s3.getAge() + "\n" + "수학 점수 : " + s3.getMath() + 
			"\n" + "영어 점수 : " + s3.getEng() + "\n" + "국어 점수 : " + s3.getKor() + "\n" + "-------------" + "\n" + 
			s3.getName() + "님의 평균 : " + s3.getAvg());
	}
	
	

}
