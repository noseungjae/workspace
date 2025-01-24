package com.kh.operator;

import java.util.Scanner;

public class ControlPractice {



public static void main(String[] args) {
	 // method01();
	 // method02();
	 // method03();
	 // method04();
	 // method05();
     // method06();
	 // method07();
		method08();
	 
}

public static void method01() {
	Scanner sc = new Scanner(System.in);
	System.out.print(
			  "1.입력"+ "\n"
			+ "2.수정"+ "\n"
			+ "3.조회"+ "\n"
			+ "4.삭제"+ "\n"
			+ "7.종료"+ "\n"
			+ "메뉴 번호를 입력하세요 : ");
	
	
	int num = sc.nextInt();
	
	
	switch(num) {
	case 1 :
		System.out.println("입력 메뉴입니다.");
	break;

	case 2 :
		System.out.println("수정 메뉴입니다.");
	break;
	
	case 3 :
		System.out.println("조회 메뉴입니다.");
	break;
	
	case 4 :
		System.out.println("삭제 메뉴입니다.");
	break;
	
	case 7 :
		System.out.println("프로그램이 종료됩니다.");
	break;
	default :
		System.out.println("잘못입력하셨습니다.");
		break;
	
	
	
	
	
	
	
}


}
	public static void method02() {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 한 개 입력해하세요 : ");
	int num = sc.nextInt();
	
	if (num> 0 && num % 2 == 0) {
		System.out.println("짝수다");
	}
	else if (num > 0 && num % 2 == 1) {
		System.out.println("홀수다");
	}
	else if (num < 0 ) {
		System.out.println("양수만 입력해주세요");
	}
	
				
	
}

	public static void method03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		if ((kor > 40)&& (eng > 40) && (mat > 40) && ((kor+eng+mat)/3>60))
			System.out.println("축하합니다, 합격입니다!");
		else 
			System.out.println("불합격입니다.");
	



}
	public static void method04() {
		
			
		
	}
	
	public static void method05() {
		
			
	}
	
	public static void method06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "비회원":
			System.out.println("댓글 작성 게시글 조회");
			break;	
		default:
			System.out.println("관리자, 회원, 비회원중에 하나를 입력해주세요.");
			break;
		}		
		
	}
	
	public static void method07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double key = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		
		double BMI = weight/(key*key);
		
		System.out.println("BMI 지수 : " + BMI);	
		
		if(BMI<18.5) {
			System.out.println("저체중");
		} else if (BMI>=18.5 && BMI <23) {
			System.out.println("정상체중");
		} else if (BMI>=23 && BMI < 25) {
			System.out.println("과체중");
		} else if (BMI>=25 && BMI < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		
	} 
	
	public static void method08() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		if (num1<=0) {
			System.out.println("잘못입력하셨습니다.");
			(num1>0)
			
		}
	}
	
	
	
	
}