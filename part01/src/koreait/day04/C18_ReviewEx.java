package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {

		String best;	//Ư������ ������ ����
		Scanner sc = new Scanner(System.in);
		int max;
		
		int ����, ����, ����;
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println();
		System.out.println("���� �Է��ϼ���.");
		
		System.out.println("���� �� ");
		���� = sc.nextInt();
		System.out.println("���� �� ");
		���� = sc.nextInt();
		System.out.println("���� �� ");
		���� = sc.nextInt();
		System.out.println();

		System.out.println("ó���Ǿ����ϴ�. >>");
		System.out.println("���� : " + (���� + ���� + ����));
		System.out.println("��� : " + ((����+����+����)/3) + ",\t����� : 3");
		System.out.println();
		if(���� > ����) {
			max = ����;
			best = "����";
		}else {
			max = ����;
			best = "����";
		}
		if (max < ����) {
			max = ����;
			best = "����";
		}
		System.out.printf("�� �л��� Ư�� ������  %s(%d)�Դϴ�.", best, max);
		sc.close();
	}

}
