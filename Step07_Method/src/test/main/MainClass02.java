package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil Ŭ������ getNum() �޼ҵ带 ȣ���� ������
		MyUtil.getNum();
		int a = MyUtil.getNum(); //getNum() �� 10�� return ����
		System.out.println(a);
		
		//MyUtil class �� getMessage() �޼ҵ带 ȣ���ϰ� ���ϵǴ� ���� msg ��� ���������� ������ ������
		MyUtil.getMessage();
		String msg = MyUtil.getMessage();
		System.out.println(msg);
		
		//MyUtil class�� ���ǵ� getName() �޼ҵ带 ȣ���ϰ� ���ϵǴ� ���� name �̶�� ���������� ������ ������
		MyUtil mu = new MyUtil();
		mu.getName();
		String name=mu.getName();
		System.out.println(name);
	}
}
