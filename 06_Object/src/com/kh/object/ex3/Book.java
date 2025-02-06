package com.kh.object.ex3;

public class Book {
		/*
		 * 접근제한자 적용해보기.
		 * 접근제한자란, 클래스 내의 멤버(변수, 메소드)들에 접근할 수 있는 범위를 제한할 때 사용하는 키워드이다.
		 * 			접근제한자는 클래스를 정의할 때도 사용한다.
		 *          - 클래스에 사용 가능한 접근제한자 : 2가지 
		 *              public, default(default는 생략을 한다. 쓰면 오류가 뜬다.)
		 *          - 클래스 내 멤버(변수, 메소드)에 사용할 수 있는 접근 제한자 : 4가지
		 *              public    : 어디서든 접근 가능하다. 
		 *              protected : 같은 패키지 또는 상속받으면 접근 가능하다.
		 *              default   : 같은 패키지에서만 접근 가능하다.
		 *              private   : 해당 클래스에서만 접근 가능하다.
		 *              
		 */	
	// ---------------------필드부(사용할 데이터를 선언하는 영역) ---------
	// *모든 변수들은 클래스 내에서만 접근 가능하도록 할 것.
	//접근제한자 [예약어] 자료형 변수명; <= "표현식"이라고 한다.
	private String title;// 제목 -title:String
	private String genre;// 장르 -genre:String
	private String author;// 저자 -author:Stirng
	private int maxPage;// 페이지 수 -maxPage:int
	// -------------------------------------------------------------
	//	[예약어] 예를들면 final  
	
	// ---------------------생성자부----------------------------------
	// * 정의한 현재 클래스를 생성할 때 사용되는 메소드
	// * 객체를 생성할 때 데이터를 초기화하기 위한 목적으로 생성자를 정의한다.
	
	// 반환명 건너뛰고 이름을 작성한다. 이름은 클래스명(Book)과 동일하게 작성해야 한다.
	public Book() {} // 기본생성자(매개변수가 없는 형태이다.)
	// => 기본생성자의 경우, 생성자를 따로 정의하지 않으면 컴파일러를 통해 기본생성자를 만들어준다.
	
	// => 매개변수 정보(개수, 종류, 순서)를 구분하여 정의하면 생성자도 오버로딩이 적용된다.
	
	// 매개변수가 있는 3개인 생성자 (제목, 장르, 저자)까지만 정보를 받는 생성자
	public Book(String title, String genre, String author) {
		// this가 의미하는 것은 ((현재 클래스 내에 있는))title변수에 전달받은 title 값을 대입하겠다.
		
		/*
		this.title = title;
		this.genre = genre;
		this.author = author;
		*/
		this(title, genre, author, 0); //this()를 사용하면 클래스 내의 다른 생성자를 호출할 수 있다.
	}
	// 매개변수가 4개인 생성자를 만들어보자.(제목, 장르, 저자, 페이지수)
	public Book(String title, String genre, String author, int maxPage) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.maxPage = maxPage;
	}
	
	// 오버로딩이 적용되므로, 매개변수를 달리해서 여러 메소드를 정의해놔도 된다.
	
	
	/*
	[생성자 규칙]
			1. 생성자명은 클래스명과 동일
			2. 반환형을 표시하지 않는다. 반환되는 값도 없다.
	*/
	//------------------------------------------------------------------------------
	// -----------------------메소드부------------------------------------------------
	// * private 변수에 접근하기 위한 메소드(getter/setter)
	
	// * 제목(title)을 저장하는 변수의 값을 조회하는 메소드 (getter)
	//        => 제목에 대한 정보를 반환해줘야 한다.
	public String getTitle() {                 //반환이 되는 변수의 자료형이 String이니까.
		return title;
	}
	
	
	// * 제목(title)에 대해 값을 저장하기 위한 메소드 (setter)
	//      => 저장할 값을 전달 받아서 변수에 저장해야 한다.
	public void setTitle(String title) { //매개변수 Run에서 입력한 값
		this.title = title; //=                  // 
      //메모리상에있는 //  매개변수를 저장한다.필드부 안에 ,따라서(매개변수값(상단 String title과 다음줄의 title이 스펠링이 맞아야 한다.)    
	} // 필드부에있는              
		
	// public이어야 외부에서 접근가능하다. 반환값이 필요할까? X void
	// 값을 변경? setter 이용한다. 저자가 궁금하다? getter메소드 이용해서 조회한다.
	 
	
	
	
	 // *저장된 데이터(변수)를 조회하는 메소드 (toString)
	 //  =>필드에 저장된 데이터를 문자열 형태로 반환
	 public String toString() {
		 return "제목: " + title + "\n"
				 + "장르: " + genre + "\n"
				 + "저자: " + author + "\n"
				 + "페이지 수: " + maxPage;
		 
	 }
}
