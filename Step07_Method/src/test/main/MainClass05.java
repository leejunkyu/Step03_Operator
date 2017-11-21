package test.main;

import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar(Car car) 메소드를 호출해보세요
		MyUtil.useCar(new Car());
		//useCar(String msg, Car car) 메소드를 호출해보세요
		MyUtil.useCar("abcd", new Car());
	}
}
