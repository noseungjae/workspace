package com.kh.object;           //반환값이 있는 타입return돌아온다제자리로(=반환된다)

public class Method02 {

	public static void main(String[] args) {
		
		System.out.println(add(10, 20));  // 30이라는 값이 return돌아온다제자리로(=반환된다)
		// => 출력 : 30
		System.out.println(add(123, 567));
		
		System.out.println(add(55));
		
		divide(50, 7);
		divide(100,0);
		
		
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;	 //리턴시 전달할 결과값을 int값과 같게 해줘야 한다.(*유의)
	}
	//* 메소드 "오버로딩" => 오버라이딩이란 상섭에서 배우는데, 오버로딩이란 메소드끼리 이름은 같고 매개변수는 다를 때 같은이름의 메소드를 여러개 작성하는 것이다.
	//			(조건) 메소드명이 동일, 매개변수 정보가 달라야 한다.
	 public static int add(int n1) {   //여기까지 하면 리턴이 없어서 오류가 난다. int n1옆에 int 하나 더 써도 오류난다.
		 return n1 + 10;                // *매개변수 정보 : 자료형(타입), 개수, 순서 를 구분해야 한다.
		 
	 }
	 
	 /*
	 public static double add(int num) {                 // 이름 add 매개변수 int 두개만 본다. 그 앞에 int인지(반환형이라고 한다.) double인지는 오버로딩에상관없다.
 		 	return num;									 // 반환형이 다르더라도 메소드명과 매개변수가 정보가 같은 경우 오류발생!!=> 오버로딩이 적용되지 않음!
	 }
	 */
	 
	 /*
	  * return의 두 가지 의미 (1) 반환 값을 돌려준다.( return 값; ) (2)메소드를 종료시킨다.( return; )
	  */
	 public static void divide(int n1, int n2) {
		 // n2 변수의 값이 0인 경우 메소드 종료!
		 if (n2 == 0 ) {
			 System.out.println("0으로 나눌 수 없습니다.");
			 return; 
		}
		 
		 System.out.println("n1 / n2 = " + (n1/n2));
	 }
}	
