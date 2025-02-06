package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		// 정의한 클래스 사용하려면, 클래스명 참조변수명 = new 클래스명();       // new 뒤에오는것은? 생성자이다!
		//                                           클래스명() -> 생성자이다!! 생성자를 호출하는 것이다.
		
		Book b1 = new Book();
		//b1.title = "자바의 정석";
		// => 해당 변수는 private으로 선언되어 있어 title 변수에 접근 불가하다.
		// --> 해당클래스(Book)이라는 클래스에서만 접근 가능하다. Run에서는 접근불가
		
		
		//--------------------------------------------------------------------
		b1.setTitle("자바의 정석"); // 값을 저장	
		String b1Title = b1.getTitle();        // 값을 조회
		System.out.println("b1: " + b1Title);
		//--------------------------------------------------------------------
		
		Book b2 = new Book("자바 프로그래밍 입문", "전공 서적", "박은종");
		b2.setTitle("Doit! 자바프로그래밍 입문");            // 제목을 바꿔줄 수 있다.
		
		String info = b2.toString();
		// 출력이 아니라 문자열로 반환을 해준다.
		System.out.println(info);
		// 확인
		
		
	}

}
