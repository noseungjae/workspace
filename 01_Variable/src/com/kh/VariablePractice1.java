		package com.kh;

import java.util.Scanner;

public class VariablePractice1 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("이름을 입력하세요 :");
				String name = sc.nextLine();
				System.out.print("성별을 입력하세요(남/여) :");
				String se = sc.next();
				System.out.print("나이를 입력하세요 :");
				int age = sc.nextInt();
				System.out.print("키를 입력하세요(cm) :");
				double key = sc.nextDouble();
			System.out.println("키 " + key + "cm인 " +age+ "살 " + se + "자 " + name + "님 반갑습니다 ^^");
			
			
			
			
			 
				
				
				
			}
}
