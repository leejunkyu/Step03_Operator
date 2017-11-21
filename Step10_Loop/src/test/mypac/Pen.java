package test.mypac;

public class Pen {
	//멤버필드
	public String color;
	//생성자
	public Pen(String color) {
		this.color=color;
		//this 는 자기자신의 참조값을 참조
	}
	//멤버 메소드
	public Pen write() {
		System.out.println(this.color+"색 Pen 으로 필기를 해요");
		return this;
	}//this는 같은 클래스 안에 있으면 생략 가능
	public Pen draw() {
		System.out.println(color+"색 Pen 으로 그림을 그려요");
		return this;
	}
}
