package com.kh.operator;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
        // practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		// practice11();
		// practice12();
		// practice13();
		practice14();
	}

	public static void practice1() {
		// 실습문제 1 풀이
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");

		int num = sc.nextInt();

		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);

	}

	public static void practice2() {
		// 실습문제 2 풀이
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");

		int num = sc.nextInt();

		String result = num > 0 ? "양수다" : num < 0 ? "음수다" : "0이다";

		System.out.println(result);

	}

	public static void practice3() {
		// 실습문제 2 풀이
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");

		int num = sc.nextInt();

		String result = num % 2 == 0 ? "짝수다" : "홀수다";

		System.out.println(result);

	}

	public static void practice4() {
		// 실습문제 4 풀이
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수: ");
		int first = sc.nextInt();

		System.out.print("사탕 개수: ");
		int second = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (first / second) + "\n" + "남은 사탕 개수 : " + (first % second));

	}

	public static void practice5() {
		// 실습문제 5 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		char gen = gender.charAt(0);
		
		String result = (gen == 'M') ? "남학생" : "여학생";
				
				
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		
		

		System.out.println(num1 + "학년 " + num2 + "반 " + num3 + "번 " + name +" "  + result + "의 성적은" + score + "이다.");
		
				
	}
	public static void practice6() {
		// 실습문제 6 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		String result = 
				   (0 < num && num <= 13) ? "어린이"
			 :     (14<num && num<=19) ? "청소년" : "성인";
		
		System.out.println(result);
		
		    		
		
		
	}
	public static void practice7() {
		// 실습문제 7 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = (kor + eng + mat);
		
		System.out.print("합계 : " + (sum)+"\n" );
		System.out.print("평균 : " + (double)(sum)/3 + "\n" );
		
		String result = (kor < 40 || eng< 40 || mat< 40) ? "불합격" : (sum/3<60 ) ? "불합격" : "합격"; 
		System.out.println(result);
	}
	
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		String num = sc.next(); 
		
		char ch = num.charAt(7); 
		
		String result = ( ch % 2 == 0 ) ? "여자" : "남자";
		System.out.println(result);
		
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = ( num3 <= num1 || num3 > num2) ? "true" : "false";
		
		System.out.println(result);
		 	
		
	}
	
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = ( num1 == num2 && num2 == num3) ? "true" : "false";
		
		System.out.println(result);
		
		
	}
	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double num4 = (int)(num1*1.4);
		double num5 = (num2);
		double num6 = (int)(num3*1.15);
		
		String result1 = (num4 > 3000) ? "3000 이상" : "3000 미만";
		String result2 = (num5 > 3000) ? "3000 이상" : "3000 미만";
		String result3 = (num6 > 3000) ? "3000 이상" : "3000 미만";
		
		
	    
		
		System.out.println("A사원의 연봉/연봉+a : " + num1 +"/" + num4 + "\n" + result1);
		System.out.println("B사원의 연봉/연봉+a : " + num2 +"/" + num5 + "\n" + result2);
		System.out.println("C사원의 연봉/연봉+a : " + num3 +"/" + num6 + "\n" + result3);
		
	}
	
	
	public static void practice12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		
		String in = sc.next(); 
		
		char ch = in.charAt(0); 
		
		
		// => char ch = sc.next().charAt(0);
		
		if ( ch >=65 && ch <=90) {
			System.out.println(ch + "은 대문자입니다.");
		} else if (ch >=97 && ch <=122) {
			System.out.println(ch + "은 소문자입니다.");
		}
		else {
			System.out.println("알파벳이 아닙니다.");
		}		
		
	}
	public static void practice13() {
	       
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요.");
		
		String in = sc.next(); 
		
		
		
		
		if (in.length() != 14) {
			System.out.println("잘못 입력되었습니다.");
	    } else {
	    	
	    	char ch = in.charAt(7);
		
		
			
		if (ch % 2 == 1) {
			System.out.println("남자입니다.");
		} else if (ch % 2 == 0) {
			System.out.println("여자입니다.");
		}  
		
	    }
	}
	public static void practice14() {
		
		
	}
	
	
}
