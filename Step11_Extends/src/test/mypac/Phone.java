package test.mypac;

public class Phone extends Object{// 아무것도 안쓰면 자동으로 object 를 상속 받는다
	//디폴트 생성자를 명시적으로 정의하기
	public Phone() {
		System.out.println("phone() 생성자 호출됨");
	}
	
	//멤버 메소드
	public void call() {
		System.out.println("전화걸기");
	}
}
