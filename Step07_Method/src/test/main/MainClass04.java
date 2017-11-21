package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		//MyUtil 클래스의 printMsg() 메소드를 호출해보세요
		MyUtil.printMsg("abcd");
		
		String str="안녕";
		MyUtil.printMsg(str);
		
		MyUtil.testMsg(new Car());
		
		}
}
