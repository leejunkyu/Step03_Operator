package test.main;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		//Pen ��ü�� �����ؼ� write() �޼ҵ带 ȣ���� ������ 
		Pen a = new Pen("blue");
		a.write().write().write().draw();
		
		Pen b=new Pen("red");
		b.write();
	}
}
