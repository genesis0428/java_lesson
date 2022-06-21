package koreait.day07;

public class C35_GlobalVar {
/*
 * [������ ����� ��ġ�� ����]
 * ��������(local variable) : �޼ҵ�, for, if, while ���{}���� ����� ����. ������ ����� ������� ����
 * ��������(global variable) : Ŭ����{}���� ����� ����
 * 
 * [���������� static ���η� ����]
 * Ŭ�����̸�.������
 * ��ü�� ���� ����ϴ� this.������ (�� �� ������ �ν��Ͻ� ����)
 * 
 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ�(�Ǵ� ������Ƽ)��� �θ��ϴ�. field property
 * 
 */
	int count;		//��������
	String message;
	static int num;
	static double point;
	static final int TEST = 9999;	//static final�� ���. ������ �� �ʱ�ȭ���� ������ ����
	
	public static void main(String[] args) {	//** static�� static �� �����Ѵ�.**
		int num = 10;	//main �޼ҵ忡���� ���
		System.out.println("num = " + num);		//10
//		System.out.println("message = " + message); //���� : static�� �ƴ� ������ ��� ���Ѵ�.
		methodB();
//		methodA();	//���� : static�� �ƴ� �޼ҵ�
	}
	
	public void methodA() {
		int num=99;		//methodA ������ ���
		System.out.println("num = " + num);		//99
		System.out.println("message = " + message);		//���������� ����� message
	}
	public static void methodB() {
		int num=77;		//methodB ������ ���
//		���������� �������� �̸��� ���� ���, ������������ �����ɴϴ�.
		System.out.println("num = " + num);		//99
		System.out.println("num = " + C35_GlobalVar.num);	//Integer.BYTES �� ���� ����
		//���������� ����� num. static �϶��� Ŭ�����̸�.�������̰� static�� �ƴҶ��� this.������
	}
	
	public void methodC(int count) {
		this.count=count;	//this�� new�� ������� ��ü.methodC �޼ҵ带 �����Ű�� ��ü
	}
}