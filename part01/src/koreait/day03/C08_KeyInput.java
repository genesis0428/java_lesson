package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {

//		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
//		
//		int width = 23;
//		int height = 19;
//		int box_area = width * height;
//		
//		System.out.println("���� : " + width + "��");
//		System.out.println("���� : " + height + "��");
//		System.out.println("���̸� ���߽��ϴ� : " + box_area + "��");
//		
//		System.out.println("=============================");
//		
//		System.out.println("[[���� �ѷ��� ���߽��ϴ�.]]");
//		
//		double half = 23.230;
//		double round = 2 * 3.14 * half; //�ѷ�
//		double circle_area = 3.14 * half * half; //����
//		
//		System.out.printf("������ : %.3f�� \n",half);
//		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
//		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n", circle_area);
//		
//		
//		//final �׽�Ʈ
//		//		���� ���� �տ� final Ű���带 ���̸� ���� ������ �� ����.
//		
//		final int test = 123;		//���� ������ϴ� ����Դϴ�.
//		System.out.println("test =" + test);
//		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[�簢���� ���� ���ϱ�]]");
		System.out.println();
		int width;
		
		System.out.print("���� �Է��ϼ���. �� ");		 
		width = sc.nextInt();
		System.out.println("�Էµ� �ʺ� ����  " + width + " �Դϴ�.");
		
		int height;
		
		System.out.print("���� �Է��ϼ���. �� ");		 
		height = sc.nextInt();
		System.out.println("�Էµ� ���� ����  " + height + " �Դϴ�.");
		
		System.out.println("�簢���� ���̴� " + width * height + " �Դϴ�.");
		System.out.println();
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.println();
		double radius;
		
		System.out.print("���� �Է��ϼ���. �� ");
		radius = sc.nextDouble();
		System.out.println("�Էµ� ������ ����  " + radius + " �Դϴ�.");
		
		System.out.println("���� �ѷ��� " + 2*radius*3.14 + " �Դϴ�.");
		System.out.println("���� ���̴� " + radius*radius*3.14 + " �Դϴ�.");
		
		sc.close(); //Ű����(ǥ���Է���ġ) �ڿ� ��� ����
	}

}
