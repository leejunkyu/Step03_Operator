package test.main;

import java.util.Scanner;
import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		for(;;) { // for문 에서 선언부,조건부,증감부를 빼고 빈칸으로 쓰면무한루프를 돌린다는 뜻
			Scanner scan=new Scanner(System.in);
			
			Random ran=new Random();
			
			System.out.print("가위(0),바위(1),보(2) 입력:");
			//정수 입력받기
			int inputNum=scan.nextInt();
			
			int otherNum=ran.nextInt(3);
			
			if(inputNum == 0) {
				System.out.println("player:가위");
			}else if(inputNum==1) {
				System.out.println("player:바위");
			}else if(inputNum==2) {
				System.out.println("player:보");
			}
			
			if(otherNum == 0) {
				System.out.println("com:가위");
			}else if(otherNum==1) {
				System.out.println("com:바위");
			}else if(otherNum==2) {
				System.out.println("com:보");
			}
			
			// ---------결과---------
			if(otherNum==0&&inputNum==1) {
				System.out.println("사용자 이김");
			}else if(otherNum==0&&inputNum==2) {
				System.out.println("컴퓨터이김");
			}else if(otherNum==1&&inputNum==0) {
				System.out.println("컴퓨터이김");
			}else if(otherNum==1&&inputNum==2) {
				System.out.println("사용자 이김");
			}else if(otherNum==2&&inputNum==0) {
				System.out.println("사용자 이김");
			}else if(otherNum==2&&inputNum==1) {
				System.out.println("컴퓨터 이김");
			}else if(otherNum==inputNum) {
				System.out.println("비겼습니다.");
			}
		}
		//System.out.println(inputNum);
	}
}
