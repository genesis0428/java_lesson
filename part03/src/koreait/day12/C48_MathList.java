package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43�� ���� ����Ʈ�� �����ϱ�	//�ۼ��� : �̱�ȣ
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;	//���� ����
		ArrayList<MathProblem> list = new ArrayList<MathProblem>();
		int ans;	int cnt = 0;
		System.out.println("--------------------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("--------------------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("���� " + (i+1) + ". " + temp.getN1() + " + " + temp.getN2() + " = �� �Է� �� ");
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			// problems[i]=temp ?????	//�迭 �ε��� i�� temp ��ü �������� ���ض�.
			list.add(temp);
			
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� " + cnt + " (" + (cnt*100/size) +" ��)");
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		for(int i=0; i<list.size(); i++)
			if(list.get(i).isCorrect()==false)	//Ʋ���� ��
			if(!list.get(i).isCorrect())	
			System.out.println("���� " + (i+1) + ". " + list.get(i).problem() + list.get(i).showAnswer()); 
    }
}