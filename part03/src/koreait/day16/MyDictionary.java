package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	//TreeMap을 mywords로 바꿔서 구현해보기

		String select, english, korean;
		int level;
		System.out.println("1.단어 저장   2. 단어 검색   3.단어장 보기   4. 레벨로 검색   5.프로그램 끝내기");
		boolean run = true;
		while(run) {
			System.out.print("-------메뉴를 선택하세요.-------");
			select = sc.nextLine();
			switch(select){
			case "1" : 
				System.out.print("English → ");
				english = sc.nextLine();
				System.out.print("Korean → ");
				korean = sc.nextLine();
				System.out.print("레벨 -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(english, korean);
				temp.setLevel(level);
				mywords.add(temp);
				break;
				
			case "2" :
				System.out.println("검색 단어 English → ");
				english = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(english))
				System.out.println("단어를 검색했습니다. : " + w);
				break;
			case "3" :
//				System.out.println("단어장 전체보기 : " + mywords);
				all(mywords);
				break;
			case "4":
				System.out.println("검색할 레벨을 입력(1 ~ 3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);	//정렬하고 출력하기
				break;
			case "5" :
				run = false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 1 ~ 4 중에서 다시 입력해주세요.");
				break;
			}
			}//while end
		System.out.println("::::: 너의 단어장을 종료합니다. :::::");
		}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}

	private static void all(List<Word> mywords) {	//mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s\t %10s", "English", "Korean", "Level"));
		System.out.println("---------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
		
	}
}
			
			
