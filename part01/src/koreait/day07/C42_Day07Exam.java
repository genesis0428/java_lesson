package koreait.day07;

import java.util.Random;
import java.util.Scanner;

//�ۼ��� : �̱�ȣ
public class C42_Day07Exam {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� Ǯ��");
		System.out.println("--------------------------------------------");
		System.out.println("�����մϴ�.");
		int count = 0;
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
								// ���� ����
		
		
		for(int i=1;i<=10;i++) {				// 10�� ����
			int A = r.nextInt(90)+10;			// ���ڸ��� ���� ���� ����
			int B = r.nextInt(90)+10;

		System.out.print("���� " + i + ". " + A + " + " + B + " = �� �Է� �� ");
			int C = sc.nextInt();					// ����ڰ� �Է��� ��

		if(C==A+B) count++;						// ����ڰ� �Է��� ��� ���� ���� ��
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� " + count + " ( " + (count * 10) + " �� )" );
		System.out.println("::::: ���� ���� ���� :::::");

	
	}
}
		
	
		
