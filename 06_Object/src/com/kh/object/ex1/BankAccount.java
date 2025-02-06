package com.kh.object.ex1;

// 클래스명 : BankAccount
public class BankAccount {
	// 데이터를 저장하는 영역 (변수 사용)
	int balance = 0;      	//예금잔액
	
	// 기능을 정의하는 부분(메소드 부분)
	// 입금 기능                                                    => 이런형태로 메소드를 작성예정
	// 
	// 접근제한자 [예약어] 반환형 메소드명(매개변수정보) {
	//}
	public void deposit(int money) { //[return을반환을 안할꺼니까 void ]
		balance += money;
	}                                                                              //변수 1개(balance), 생성자0개(+1)기본생성자로 생긴다. 메소드는 3개(디파짓위드로우체크)
	
	// 출금기능 (예금잔액에서 값을 뺌) 
	public int withdraw(int money) {
		// 예금 잔액에서 전달된 금액을 뺌
		balance -= money;
		// 예금 잔액을 반환
		return balance;
	}
	public void check() { // 조회기능(예금잔액정보를 반환x 출력O , 출력해주고 말 거니까 반환필요없다, 매개변수도 필요없음.조회만 하니까)
		System.out.println("잔액 : " + balance);
	
	}	
}

