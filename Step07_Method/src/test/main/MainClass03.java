package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		//1. MyUtil class�� getCar() �޼ҵ带 ȣ���ؼ� ���ϵǴ� ���� car1 �̶�� ���������� ��ƺ�����
		Car car1=MyUtil.getCar();
		//2.car1 ������ ����ִ� ��ü�� �������� �̿��ؼ� drive() �޼ҵ带 ȣ���� ������
		car1.drive();
	}
}
