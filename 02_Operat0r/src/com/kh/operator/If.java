package com.kh.operator;

import java.util.Scanner;

public class If {
	/*
	 *  조건문 if 
	 *  : 기본적으로 프로그램은 순차적으로 진행 (위->아래, 왼쪽->오른쪽)
	 *    순차적인 흐름을 바꿀 때 제어문을 사용한다.(조건문, 반복문, ..)을 사용하여 제어가 가능하다.
	 *  : 조건문 - 조건에 따라 선택적으로 실행할 때
	 *  : 반복문 - 반복적으로 실행할 때
	 *  
	 *  : "조건식"을 통해 참, 거짓을 판단하여 그에 해당하는 코드를 실행한다.
	 *  => 조건식의 결과 : true, false
	 *  => 연산자 : 비교연산자( < > ==), 논리연산자(&& ||)를 주로 사용
	 *  
	 *  : 조건문의 종류 : if, switch
	 *  * if
	 *   	[1] 단독 if문
	 *   		if (조건식) {
	 *   			// 조건식이 참인 경우 실행할 코드를 작성
	 *   			}
	 *   			// => 조건식이 거짓인 경우 실행되는 내용은 없다.
	 *   	[2] if ~ else문
	 *   			if (조건식) {
	 *       			  // 조건식이 참인 경우 실행할 코드를 작성
	 *       			} else { 
	 *       			  // 조건식이 거짓이 ㄴ경우 실행할 코드를 작성
	 *       	     	}
	 *       [3] if ~ else if ~ else 문
	 *       		if (조건식) {
	 *       			// 조건식이 참인 경우 실행할 코드
	 *                } else if (조건식2) {
	 *                  // 조건식이 거짓이고, 조건식2가 참인 경우 실행할 코드
	 *                }
	 *                  else {
	 *                   // 조건식, 조건식2 모두 거짓인 경우 실행할 코드
	 *                  }
	 *    
	 */

	public static void main(String[] args) {
		method1();			
    
	}
	public static void method1() {
		/*
		 * 사용자의 입력 값이 1~10 사이의 값인지 확인하여
		 * 범위를 벗어난 경우 "범위를 벗어났습니다."를 출력하고,
		 * 범위 내에 있는 경우 입력값을 출력
		 */

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number > 0 && number < 11) {
			System.out.println(number);
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}