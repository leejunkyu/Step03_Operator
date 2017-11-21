package test.main;

import test.mypac.Pen;

public class MainClass07 {
	public static void main(String[] args) {
		// Pen type ��ü�� ������ �ִ� �� 5��¥�� �迭 ��ü ����
		Pen[] pens=new Pen[3];
		
		//������ �濡 Pen ��ü�� �����ؼ� ������ ����
		pens[0]=new Pen("red");
		pens[1]=new Pen("blue");
		pens[2]=new Pen("green");
		
		//�ݺ��� �̿��ؼ� �迭�� ����� ��� pen ��ü�� write() �޼ҵ�� draw() �޼ҵ� ȣ��
		for(int i=0; i<pens.length; i++) {
			Pen tmp=pens[i];
			tmp.write().draw();
		}
		System.out.println("---- Ȯ�� for �� ----");
		for(Pen tmp: pens) {
			tmp.write().draw();
		}
	}
}
