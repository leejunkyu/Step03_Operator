package test.main;

import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar(Car car) �޼ҵ带 ȣ���غ�����
		MyUtil.useCar(new Car());
		//useCar(String msg, Car car) �޼ҵ带 ȣ���غ�����
		MyUtil.useCar("abcd", new Car());
	}
}
