package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		HashMap<String, String> words = new HashMap<>();	//�ܾ��� ������ �ڷ� ����
		TreeMap<String, String> words = new TreeMap<String, String>();	//���� �˻� ������ ������ Map�� ���� : ������ �Ǵ� Map
		//Key : ����ܾ�, value : �ѱ� ��
		String select, english, korean;
		System.out.println("1.�ܾ� ����   2. �ܾ� �˻�   3.�ܾ��� ����   4. ���α׷� ������");
		boolean run = true;
		while(run) {
			System.out.print("-------�޴��� �����ϼ���.-------");
			select = sc.nextLine();
			switch(select){
			case "1" : 
				System.out.print("English �� ");
				english = sc.nextLine();
				System.out.print("Korean �� ");
				korean = sc.nextLine();
				words.put(english, korean);
				break;
				
			case "2" :
				System.out.println("�˻� �ܾ� English �� ");
				english = sc.nextLine();
				System.out.println("�ܾ �˻��߽��ϴ�. : " + words.get(english));
				break;
			case "3" :
				System.out.println("�ܾ��� ��ü���� : " + words);
				break;
			case "4" :
				run = false;
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 ~ 4 �߿��� �ٽ� �Է����ּ���.");
				break;
			}
			}
		}
	//���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ�մϴ�.
	//int score = Integer.parseInt(sc.nextLine());
	//���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
	//��� : �� �ҽ� ���Ͽ��� nextInt�� ������ nextLine�� ������ �ϳ��� ����ؾ��Ѵ�.
}
			
			
