package com.kh.operator;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// example01();
		 example02();
		  // example03();
		/*
		 * [1] 복합 대입 연산자
		 * 	   : 대입 연산자와 다른 연산자를 조합해서 하나의 연산자처럼 사용되는 연산자
		 * 
		 *  	n1 += 10;
		 *   	=> n1 = n1 + 10;
		 * [2] 비교 연산자, 논리 연산자
		 * 	   : 결과 값이 참(true) 또는 거짓(false)
		 * 	   : 이항 연산자
		 */
		 
	}
	public static void example03() {
		/*
		 * 산술 연산자 활용 예제_
		 * 키와 몸무게를 입력받아서 BMI를 계산하여 출력하라.
		 * 	BMI : 몸무게 / (키(m)*키(m));
		 * 	BMI 판정기준
		 *  - 18.5 이하 : 저체중
		 *  - 18.5 < BMI < 22.9 : 정상
		 *  - 23.0 < BMI < 24.9 : 과체중
		 *  - 25 이상 : 비만
		 *  
		 *  출력 예) "BMI" 지수는 20.5로 정상입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		int key = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		int weight = sc.nextInt();
		
		int key2 = (key/100);
		double BMI = (weight/((key2)^2));
		
		
		String result = 
		   (BMI <18.5) ? "저체중"
	 :     (18.5<=BMI && BMI<=22.9) ? "정상"
     :     (23<=BMI && BMI<=24.9) ? "과체중"
     :     (24.9<BMI) ? "비만": "알수없음";
    		
     System.out.println("당신의 BMI지수는 " + (double)(BMI) +"로 " + (result)+ "입니다.");
    		 
		
		
		
	}
	public static void example02() {
		/*
		 * 나이를 입력받아 초등학생, 중학생, 고등학생을 구분해서 출력해봐라. (그 외에는 "알 수 없음")
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();
		/*
		
		String result =
		(8  <= num && num <= 13) ? "초등학생"
	:   (14 <= num && num <= 16) ? "중학생" 
	:   (17 <= num && num <= 19) ? "고등학생" : "알수없음";
		System.out.println("결과: " + result);
		
		*/
		// ---
		
		// SCE && || 연산자가 수행될 때 두 항을 모두 실행하지 않더라도 
		//          결과를 알 수 있는 경우 뒤에 오는 연산을 수행하지 않는다.
		// * && : 앞의 조건이 false일 때 뒤의 조건이 수행되지 않는다.
		// * || : 앞의조건이 true일 떄 뒤의 조건이 수행되지 않는다.
		int num7 = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num+=15) < 0) && ((i*=2) > 2);
		System.out.println("======= && 연산 결과 =======");
		System.out.println("result2: " +result2);
		System.out.println("i" + i);
		System.out.println("num" + num);
		// => result2 : false, i= 3, num=25
		
		                               //i값에 2를 곱해서 대입하라.
		result2 = ((num+=15) < 0) || ((i*=2) > 2);
		System.out.println("======= || 연산 결과 =======");
		System.out.println("result2: " +result2);
		System.out.println("i" + i);
		System.out.println("num" + num);
		// => result : true , i=6 ,num=40
		
		
				
				
				
		
		
	}

	public static void example01() {

		/*
		 * 사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과를 출력
		 * => 숫자를 입력받을 때 타입을 short 자료형 사용 (.nextShort())
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		short num = sc.nextShort();
		
		// num += 7L; // 데이터를 표현하는 방법이다 long타입의 숫자 7 L이 없으면 int
		// num = num + 7L;
			
		System.out.print("입력 값 :" + num + ", 7L을 더한 값 : " + (num+=7L));
		// 복합대입연산자를 사용하지 않은 경우
		
	}
}
