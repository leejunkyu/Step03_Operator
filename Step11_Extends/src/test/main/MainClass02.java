package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		// SmartPhone 객체의 참조값을 다양한 type 변수에 담을수 있다(다형성)
		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();//자식 객체는 부모 type 으로도 받아진다.
		HandPhone p3=new SmartPhone();
		SmartPhone p4=new SmartPhone();
	}
}
