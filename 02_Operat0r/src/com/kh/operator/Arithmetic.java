package com.kh.operator;

public class Arithmetic {
	
		/*
		 *  산술연산자 (이항연산자)
		 *  => + - * % /
		 *  
		 *  우선순위 : + - * % /   
		 */

	public static void main(String[] args) {
		 method1();
		  // method2();
	}
	
	public static void method2() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;   //c의 값은?
		
		int d = c / a; // d의 값은?
		int e = c % a; // e의 값은?
		int f = e++;   // f의 값은?
		int g = (--b) + (d--); // g의 값은?
		int h = 2; //h의 값은?
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // i의 값은?
		
		System.out.printf("a : %d, b : %d, c : %d, d : %d\n" , a, b, c, d);
		System.out.printf(" e : %d, f : %d, g : %d, h : %d, i : %d\n", e, f, g, h, i);
		
		
	
	}
	
	public static void method1() {
		int n1 = 11;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 나머지 연산자(%) -> 짝수/홀수 판별
		// (변수 % 2 == 0) => 짝수
		// (변수 % 2 != 0) => 홀수
		// => !(변수 % 2 == 0) 부정의 위치를 앞으로 빼도 똑같이 홀짝판별한다. 짝수가 아닌가?
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0)); // true
		System.out.printf("n2의 값은 짝수인가? %b\n", (n2 % 2 == 0)); // false
		
		
	} 
}
