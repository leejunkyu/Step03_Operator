package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		// Scanner ��ü �����ؼ�
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�Է�:");
		//���ڿ� �Է¹ޱ�
		String msg=scan.nextLine();
		
		System.out.println("msg:"+msg);
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}