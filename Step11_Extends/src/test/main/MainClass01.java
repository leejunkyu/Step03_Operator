package test.main;

import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.call();
		
		System.out.println("------------");
		
		HandPhone p2=new HandPhone();
		p2.call();
		p2.mobilecall();
		p2.takepicture();
	}
}
