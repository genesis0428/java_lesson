package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		//sc�� �������Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. �� ������ ����
//			�� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ������ �����Ѵ�.
		Scanner sc = new Scanner(System.in);		//Ű���� �Է��� ���� ��������.ǥ���Է����� Scanner ��ü�� ����� ���� sc�� �����մϴ�.
		
		int data;
		
		System.out.print("������ �Է��ϼ���. �� ");		//�Է¾ȳ� �޽��� 
		data = sc.nextInt();		//����ڷκ��� Ű���� �Է¹ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����
		
		// ����ڰ� ���ڸ� �Է����� �ʾ��� ���� ������ ��ȯ���� ���ϰ� ������ �߻���Ų��.
		System.out.println("�Էµ� ����  " + data + "�Դϴ�.");
		System.out.println();
		
		double point;
		System.out.println("�Ǽ��� �Է��ϼ���. �� ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + "�Դϴ�.");
	}

}


/*
 * 	ǥ�� ��� : System.out	(out�� System Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� ���´�.)
 *  ǥ�� �Է� : System.in      -> in�� System Ŭ������ ������ �ʵ�.
 *                         -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 
 */
