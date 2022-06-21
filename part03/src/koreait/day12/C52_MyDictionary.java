package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		HashMap<String, String> words = new HashMap<>();	//단어장 저장할 자료 구조
		TreeMap<String, String> words = new TreeMap<String, String>();	//이전 검색 가능한 구조로 Map을 생성 : 정렬이 되는 Map
		//Key : 영어단어, value : 한글 뜻
		String select, english, korean;
		System.out.println("1.단어 저장   2. 단어 검색   3.단어장 보기   4. 프로그램 끝내기");
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
				words.put(english, korean);
				break;
				
			case "2" :
				System.out.println("검색 단어 English → ");
				english = sc.nextLine();
				System.out.println("단어를 검색했습니다. : " + words.get(english));
				break;
			case "3" :
				System.out.println("단어장 전체보기 : " + words);
				break;
			case "4" :
				run = false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 1 ~ 4 중에서 다시 입력해주세요.");
				break;
			}
			}
		}
	//참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
	//int score = Integer.parseInt(sc.nextLine());
	//이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
	//결론 : 한 소스 파일에서 nextInt만 쓰던지 nextLine만 쓰던지 하나만 사용해야한다.
}
			
			
