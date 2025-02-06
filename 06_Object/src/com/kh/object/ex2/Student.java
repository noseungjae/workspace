package com.kh.object.ex2;
/*
 * 클래스의 구조
 *   public 접근제한자를 작성하고
 *   class 그대로 쓰고
 *   Student (Class명) 클래스명을 써준다.
 *   
 *         중괄호 내에
 *          - 변수부(사용할 데이터를 선언하는 영역) -> 필드부라고 표현한다.
 *          
 *          - 생성자부 (데이터를 초기화하기 위한 특수한 목적으로 메소드를 정의하는 영역이다)
 *          
 *          - 메소드부 (기능을 정의하는 영역)
 *          
 *          설계도이다. 정해진 순서가 있는 건 아니다.
 *          
 */
public class Student {
		// 필드부	(사용할 데이터를 선언하는 영역)
		String name;
		int age;
		double height;
		// -------------------
		// 메소드부 /* 저장된 데이터를 출력해주는 메소드 */
		public void print() {                            
			System.out.printf("이름 : %s, 나이 : %d, 키 : %.2f\n", name, age, height);
		}											  // .2 하면 소수점 두자리 까지만 표시한다는 뜻
		// -------------------
}
