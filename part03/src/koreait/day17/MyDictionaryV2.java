package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;


public class MyDictionaryV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	//TreeMap�� mywords�� �ٲ㼭 �����غ���
		try {
			System.out.print("���Ͽ��� �о�ñ��? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
				read(mywords,"C:\\IT Class\\���� ���ѻ���.txt");
			
			else
				System.out.println("������ ���� ����ϴ�.");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �߿� ���� �߻� - " + e1.getMessage());
		}	//���Ͽ��� ���� ���� �о���� �� ������ mywords ����Ʈ�� ����
		
		String select, english, korean;
		int level;
		System.out.println("1.�ܾ� ����   2. �ܾ� �˻�   3.�ܾ��� ����   4. ������ �˻�   5.���α׷� ������");
		boolean run = true;
		while(run) {
			System.out.print("----------------------�޴��� �����ϼ���.---------------------");
			select = sc.nextLine();
			switch(select){
			case "1" : 
				System.out.print("English �� ");
				english = sc.nextLine();
				System.out.print("Korean �� ");
				korean = sc.nextLine();
				System.out.print("���� -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(english, korean);
				temp.setLevel(level);
				mywords.add(temp);
				break;
				
			case "2" :
				System.out.println("�˻� �ܾ� English �� ");
				english = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(english))
				System.out.println("�ܾ �˻��߽��ϴ�. : " + w);
				break;
			case "3" :
//				System.out.println("�ܾ��� ��ü���� : " + mywords);
				all(mywords);
				break;
			case "4":
				System.out.println("�˻��� ������ �Է�(1 ~ 3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);	//�����ϰ� ����ϱ�
				break;
			case "5" :
				run = false;
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 ~ 5 �߿��� �ٽ� �Է����ּ���.");
				break;
			}
		}	//while end
		
		try {
			System.out.print("���Ͽ� �����ұ��? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
					//mywords ����Ʈ�� ������ ���Ͽ� �����ϱ�
			save(mywords,"C:\\IT Class\\���� ���ѻ���.txt");
			else
				System.out.println("������ ������� �ʾҽ��ϴ�.");
		} catch(FileNotFoundException e) {
			System.out.println("���� ���� �߿� ������ ������ϴ�. -" + e.getMessage());
		}
		
		System.out.println("::::: ���� �ܾ����� �����մϴ�. :::::");
		
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		//���Ͽ� ����ϱ�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();			//���Ͽ��� 1�� �о�°� ����
			System.out.println(temp.substring(0, temp.indexOf("(")));		//��ü���鋚 �ʿ��� ���� �������� �׽�Ʈ
			
			//���� ����� ����� StringTokenizer�� Word ��ü ����� mywords ����Ʈ�� �߰��ϱ�
			//�ڵ� �ϼ��Ǹ� 3�� ��ü���� �����غ�����.
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			while(stk.hasMoreTokens()) {
				mywords.add(new Word(stk.nextToken(),						//english �ʵ尪
									stk.nextToken(),						//korean �ʵ尪
									Integer.parseInt(stk.nextToken())));	//level �ʵ尪
						
			}
			
		}
		sc.close();
		System.out.println("���� �о���� �Ϸ�Ǿ����ϴ�.");
		
	}
	
	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}

	private static void all(List<Word> mywords) {	//mywords�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s \t%10s", "English", "Korean", "Level"));
		System.out.println("------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s \t%10d", w.getEnglish(), w.getKorean(), w.getLevel())); 
		}
		
	}
}
			
			
