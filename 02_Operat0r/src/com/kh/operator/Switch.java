package com.kh.operator;

import java.util.Scanner;

public class Switch {
	/*
	 * switch
	 * :if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
	 * :실행할 코드만 실행하고 자동으로 종료되지 않음 => 직접 종료될 수 있게 설정! (break)
	 * 
	 * switch(비교대상) { // 비교대상(변수/식) --> 정수, 문자, 문자열
	 *  case 값: // 비교대상 == 값
	 *       실행코드;
	 * case 값2: // 비교대상 == 값2       
	 *       이 때 실행할 코드;
	 *  ...
	 *  default:      // 모든 case가 해당되지 않을 때
	 *      실행코드;      
	 */

	public static void main(String[] args) {
		// method1();
		// method2();
		 method3();
	}
	public static void method3() {
			/*
			 * "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
			 * 
			 * 월을 입력하세요 : xx
			 * xx월은 xx일 까지입니다.
			 */
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			System.out.println(month + "월은 31일까지입니다.");
		break;
		case 4, 6, 9, 11 : //JDK 14version부터 지원된다.
			System.out.println(month + "월은 30일까지입니다.");
		break;
		case 2 :
			System.out.println(month + "월은 28일까지입니다.");
		break;
		default :
			System.out.println("1~12의 값을 입력해주세요.");
			break;
		
		}
		
		
		
		
		
	}
	
	
	
	
	public static void method2() {
		/*
		 * 과일을 구매하는 프로그램 *
		 * 사용자가 구매하고자 하는 과일을 입력하면, 해당 가격을 출력
		 * 
		 * 출력 => {과일이름}의 가격은 {과일가격}원입니다.
		 * 
		 * 사과 : 15000
		 * 포도 : 30000
		 * 귤  :  8000
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 입력하세요 : ");
		
		String fruit = sc.nextLine();
		
		switch(fruit) {
			case "사과":
				System.out.println(fruit + "의 가격은 15000원입니다.");
				break;
			case "포도":
				System.out.println(fruit + "의 가격은 30000원입니다.");
				break;
			case "귤":
				System.out.println(fruit + "의 가격은 8000원입니다.");
				break;	
			default:
				System.out.println("가격정보가 없습니다.");
				break;
			}		
		
		 
		
		
		
	
	
	}
	
	
	
	
	public static void method1() {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		
		int number =  sc.nextInt();
		
		switch(number) {

		case 1:
			System.out.println("빨간색");
			break;
			
		case 2:
			System.out.println("파란색");
			break;
			
		case 3:
			System.out.println("초록색");
			break;
			
		default:
			System.out.println("잘못입력하셨습니다.");
		
		
		}
		*/
		
		/*
		 * 정수를 입력받아, 아래 조건에 따라 출력.
		 * 입력받은값이 1 이면 "빨간색"
		 *           2 이면 "파란색"
		 *           3 이면 "초록색"
		 *           그 외 "잘못입력하셨습니다."
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		
		int number =  sc.nextInt();
		
		if (number == 1) {
		 System.out.println("빨간색");
		} else if (number == 2) {
		 System.out.println("파란색");
		} else if (number == 3) {
		 System.out.println("초록색");
		} else {
		 System.out.println("잘못입력하셨습니다.");
		}
		 
			
	
	}
	
	
	

}
