package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		// MyUtil Ŭ������ ������ showversion() �޼ҵ带 ȣ���� ������	
		MyUtil.showVersion();
		
		// MyUtil Ŭ������ ������ sendMessage() �޼ҵ带 ȣ���� ������
		MyUtil mu = new MyUtil();
		mu.sendMessage();
		
		MyUtil mu2 = new MyUtil();
		mu2.sendMessage();
	}
}
