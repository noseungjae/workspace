package com.kh;

import java.util.Scanner;			// Scanner import (연결)

public class VariablePractice0 {

	public static void main(String[] args) {
		/*
		 * (1) 아래 코드를 변수를 사용하여 실행
		 */
		System.out.println("현재 2025년이고 올해 20살입니다.");
		// => 매년 출력한다면.. 어떤 부분을 변수로 사용할지?
		// - println 메소드 사용
		int year = 2002;
		int age = 14;
		System.out.println("현재" + year + "년이고 올해 " + age + "살입니다.");
		// - printf 메소드 사용
		System.out.printf("현재 %d년이고 올해 %d살입니다.\n", year, age);
		
		
		
		System.out.println("몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		// - println 메소드 사용
		final int WEIGHT = 80;
		System.out.println("몸무게가" + WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		// - printf 메소드 사용
		System.out.printf("몸무게가 %dkg 이상인 경우 탑승하지 못합니다. \n", WEIGHT);
		
		System.out.println("-----------------------------------");
		/*
		 * 입력을 받기 위한 기능을 포함한 클래스 : Scanner
		 * 1) 연결 : import 전체클래스명; // 패키지경로.클래스명
		 *          import java.util.Scanner;
		 * 2) 생성 : new 생성자;
		 * 			new Scanner(System.in);  
		*/
		Scanner sc = new Scanner(System.in);     // 생성 및 할당
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(name+"님 반갑습니다^^");
		System.out.print("나이 : ");
		int year2 = sc.nextInt();   //언제 입력하나 기다린다.
		System.out.println(year2+ "살입니다.");
		
		sc.nextLine(); // 버퍼 비우기! \n 남아있기 때문에..
		
		System.out.print("하고싶은말 : ");
		String temp = sc.nextLine();
		System.out.println(temp);
		
		
		
		
	
	}
}