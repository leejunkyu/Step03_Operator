package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type 으로 받기
		SmartPhone p1=new SmartPhone();
		//p1 에 들어 있는 참조값을 HandPhone type 변수에 담기
		HandPhone p2=p1;
		//p1 에 들어 있는 참조값을 Phone type 변수에 담기
		Phone p3=p1;
		//p1 에 들어 있는 참조값을 Object type 변수에 담기
		Object p4=p1;
		
		//p1,p2,p3,p4, 에 들어 있는 촘조값은 모두 같다
		if(p1==p2) {
			System.out.println("같아요");
		}
		
		//p4에 들어 있는 참조값을 Phone type 으로 casting
		Phone p5=(Phone)p4;
		//p4 에 들어 있는 참조값을 HandPhone type 으로 casting
		HandPhone p6=(HandPhone)p4;
		//p4에 뜰어 있는 참조값을 SmartPhone type 으로 casting
		SmartPhone p7=(SmartPhone)p4;
	}
}
