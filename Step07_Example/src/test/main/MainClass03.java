package test.main;

import java.util.Scanner;
import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		for(;;) { // for�� ���� �����,���Ǻ�,�����θ� ���� ��ĭ���� ���鹫�ѷ����� �����ٴ� ��
			Scanner scan=new Scanner(System.in);
			
			Random ran=new Random();
			
			System.out.print("����(0),����(1),��(2) �Է�:");
			//���� �Է¹ޱ�
			int inputNum=scan.nextInt();
			
			int otherNum=ran.nextInt(3);
			
			if(inputNum == 0) {
				System.out.println("player:����");
			}else if(inputNum==1) {
				System.out.println("player:����");
			}else if(inputNum==2) {
				System.out.println("player:��");
			}
			
			if(otherNum == 0) {
				System.out.println("com:����");
			}else if(otherNum==1) {
				System.out.println("com:����");
			}else if(otherNum==2) {
				System.out.println("com:��");
			}
			
			// ---------���---------
			if(otherNum==0&&inputNum==1) {
				System.out.println("����� �̱�");
			}else if(otherNum==0&&inputNum==2) {
				System.out.println("��ǻ���̱�");
			}else if(otherNum==1&&inputNum==0) {
				System.out.println("��ǻ���̱�");
			}else if(otherNum==1&&inputNum==2) {
				System.out.println("����� �̱�");
			}else if(otherNum==2&&inputNum==0) {
				System.out.println("����� �̱�");
			}else if(otherNum==2&&inputNum==1) {
				System.out.println("��ǻ�� �̱�");
			}else if(otherNum==inputNum) {
				System.out.println("�����ϴ�.");
			}
		}
		//System.out.println(inputNum);
	}
}
