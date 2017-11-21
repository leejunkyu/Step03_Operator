package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil 클래스의 getNum() 메소드를 호출해 보세요
		MyUtil.getNum();
		int a = MyUtil.getNum(); //getNum() 이 10을 return 해줌
		System.out.println(a);
		
		//MyUtil class 의 getMessage() 메소드를 호출하고 리턴되는 값을 msg 라는 지역변수에 저장해 보세요
		MyUtil.getMessage();
		String msg = MyUtil.getMessage();
		System.out.println(msg);
		
		//MyUtil class에 정의된 getName() 메소드를 호출하고 리턴되는 값을 name 이라는 지역변수에 저장해 보세요
		MyUtil mu = new MyUtil();
		mu.getName();
		String name=mu.getName();
		System.out.println(name);
	}
}
