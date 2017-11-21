package test.mypac;

/*
 *  [ �޼ҵ� �����ϱ� ]
 *  
 *  1. ����������
 *  2. static or non static
 *  3. return data trpy
 *  4. �޼ҵ�� 
 *  5. �޼ҵ忡 ���޹޴� ������ ���� �� ������ type
 */
public class MyUtil {
	//�޼ҵ� �����ϱ�
	public static void showVersion() {
		System.out.println("showVersion() ȣ���");
	}
	
	public void sendMessage() {
		System.out.println("sendMessage() ȣ��");
	}
	
	public static int getNum() {
		System.out.println("getNum() ȣ��");
		return 10;
	}
	
	public static String getMessage() {
		System.out.println("getMessage() ȣ��");
		return "Hello!";
	}
	
	public String getName() {
		System.out.println("getName() ȣ��");
		return "�豸��";
	}
	/*
	 * ���� ������ : public
	 * static
	 * return data type : Car
	 * �޼ҵ�� : getCar
	 * �޼ҵ� ���� : ����
	 */
	
	public static Car getCar() {
		// Car ��ü�� �����ؼ�
		System.out.println("getCar() ȣ��");
		// �������� ������ �ش�.
		return new Car();
	}
	
	//���ڷ� String type �� �޴� �޼ҵ�
	public static void printMsg(String msg) { //���������� �޼ҵ忡 ��������� ���� �����ǰ� return �Ǹ� �������
		System.out.println("printMsg() ȣ���");
	}
	
	public static void testMsg(Car car) {
		System.out.println("testMsg() ȣ���");
	}
	//���ڷ� Car type �� �޴� �޼ҵ�
	public static void useCar(Car car) {
		car.drive();
	}
	//�޼ҵ嵵 �������� ����
	//���ڷ� String type �� Car tpye �� ���� �޴� �޼ҵ�
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}
