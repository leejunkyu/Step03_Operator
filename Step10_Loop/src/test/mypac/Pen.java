package test.mypac;

public class Pen {
	//����ʵ�
	public String color;
	//������
	public Pen(String color) {
		this.color=color;
		//this �� �ڱ��ڽ��� �������� ����
	}
	//��� �޼ҵ�
	public Pen write() {
		System.out.println(this.color+"�� Pen ���� �ʱ⸦ �ؿ�");
		return this;
	}//this�� ���� Ŭ���� �ȿ� ������ ���� ����
	public Pen draw() {
		System.out.println(color+"�� Pen ���� �׸��� �׷���");
		return this;
	}
}
