package com.kh.object.ex1;

public class Run {

	public static void main(String[] args) {
		// BankAccout 클래스 사용하려면
		// *변수 선언하고 인스턴스를 생성하면 된다.
		BankAccount ba; //변수 선언. BankAccount타입으로 변수 선언.
		ba = new BankAccount(); //이 생성자 형태로 형성된 인스턴스를 생성하고 할당.(주소값을 갖는다) (ba는 참조변수가된다.)
		// ba 변수는 참조변수가 되고, 생성된 인스턴스는 주소값을 갖는다!
		
		// 입금( deposit메소드 호출)
		//      => 참조변수명.메소드명(전달값);
		ba.deposit(10000);
		
		// 조회 ( check메소드 호출)
		ba.check();
		
		// 출금 ( withdraw메소드 호출)
		ba.withdraw(777);
		
		ba.check();     
		// --------------------------------------------------------------
		BankAccount ba2 = ba;
		// => ba2 변수는 ba 참조변수가 가지고 있는 인스턴스의 주소값을 저장하게 된다.
		//    같은 인스턴스를 참조하게 된다.
		ba2.deposit(50000);
		
		ba.check(); // 얕은복사, 같은 인스턴스(주소값Heap 0x123)를 참조하므로 변수명은 다르지만 ba2, ba는 똑같이 작동한다.
		// 일반적인 변수는 값 자체를 저장한다.
		// ba는 stack heap에 저장된다.
		// ba2 stack에만 생성되고 heap에 만들어진 ba의 인스턴스를 똑같이 갖는다.(얕은복사)
		
		// 참조변수 중요* 반드시 이해할 것.

}
}
