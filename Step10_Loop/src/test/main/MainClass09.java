package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ����");

		/*
		 *  MemberDto ��ü�� ������ �ִ� �� 3�� ¥�� �迭 ��ü�� �����ؼ� 3���� ȸ�� ������ ���� ������ ������
		 */
		//ȸ�������� ������ �迭 ��ü ����
		MemberDto[] members = new MemberDto[3];
		
		//MemberDto ��ü�� ������ ȸ������ �����ϱ�
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("�豸��");
		dto1.setAddr("��ŵ�");
		
		MemberDto dto2=new MemberDto(2, "�ذ�", "�뷮��");
		//MemberDto dto3=new MemberDto(3, "������", "�߶���");
		
		members[0]=dto1;
		members[1]=dto2;
		members[2]=new MemberDto(3, "������", "�߶���");
		
		for(int i=0; i<members.length; i++) {
			System.out.println("��ȣ:"+members[i].getNum()+"   �̸�:"+members[i].getName()+"    �ּ�:"+members[i].getAddr());
		}
		//for(MemberDto tmp:members) { 
			//System.out.println("��ȣ:"+members[i].getNum()+"   �̸�:"+members[i].getName()+"    �ּ�:"+members[i].getAddr());
		//}
		
		
	}
	
	
	//static ��� �޼ҵ�
//	public static void showInfo(MemberDto dto) {
//		System.out.println("��ȣ:"+dto.getNum());
//		System.out.println("�̸�:"+dto.getName());
//		System.out.println("�ּ�:"+dto.getAddr());
//		System.out.println("------------------");
//	}
}
