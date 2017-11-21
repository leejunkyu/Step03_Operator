package test.mypac;

/*
 *  [ 메소드 정의하기 ]
 *  
 *  1. 접근지정자
 *  2. static or non static
 *  3. return data trpy
 *  4. 메소드명 
 *  5. 메소드에 전달받는 인자의 갯수 와 데이터 type
 */
public class MyUtil {
	//메소드 정의하기
	public static void showVersion() {
		System.out.println("showVersion() 호출됨");
	}
	
	public void sendMessage() {
		System.out.println("sendMessage() 호출");
	}
	
	public static int getNum() {
		System.out.println("getNum() 호출");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() 호출");
		return "Hello!";
	}
	
	public String getName() {
		System.out.println("getName() 호출");
		return "김구라";
	}
	/*
	 * 접근 지정자 : public
	 * static
	 * return data type : Car
	 * 메소드명 : getCar
	 * 메소드 인자 : 없음
	 */
	
	public static Car getCar() {
		// Car 객체를 생성해서
		System.out.println("getCar() 호출");
		// 참조값을 리턴해 준다.
		return new Car();
	}
	
	//인자로 String type 을 받는 메소드
	public static void printMsg(String msg) { //지역변수는 메소드에 실행순서가 오면 생성되고 return 되면 사라진다
		System.out.println("printMsg() 호출됨");
	}
	
	public static void testMsg(Car car) {
		System.out.println("testMsg() 호출됨");
	}
	//인자로 Car type 을 받는 메소드
	public static void useCar(Car car) {
		car.drive();
	}
	//메소드도 다중정의 가능
	//인자로 String type 과 Car tpye 을 전달 받는 메소드
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}
