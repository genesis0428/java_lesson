package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		//문자코드 정수값 출력은? →
//		System.out.printf("c1 = %d\n", c1);		//char형은 %d가 아닙니다.
		System.out.printf("c1 = %d\n", (int)c1);
		System.out.printf("c2 = %d\n", (int)c2);
		
		c1 = (char)(c1 + 1);	//덧셈 연산 가능. 연산결과 대입할때는 casting 필요
		System.out.println("c1 = " + c1);
		
		c1++;					//++ 연산은 c1 = c1+1, char 형에서는 casting도 합니다.
		System.out.println("c1 = " + c1);
		
		//한글 문자 테스트 : 한글문자코드는 10진수값을 44032 ~ 55203, 16진수(2진수) ac00 ~ d7a3
		char h1 = '가';
		char h2 = 44032;		//
		char h3 = '\uac00';		//	\\u는 16진수 유니코드, ac00은 16진수 값
		
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n", (int)h1);
		System.out.printf("h2 = %d\n", (int)h2);
		System.out.printf("h3 = %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		//한글의 마지막 문자
		char h4 = 55203;
		char h5 = '\ud7a3';
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4 = " + h4);	//해당되는 모양의 문자가 없음 ? 표시
		
		h5--;
		System.out.println("h5 = " + h5);	//힢힣
		System.out.println('H'+'e'+'l'+'l'+'o'); //각 문자코드값을 더한 결과
		//hello 출력하려면 char의 배열로 처리해야한다.
	}
	
	//char이 모여서 한줄로 나란히 나열하면 → 문자열이 됩니다. "Hello"는 'H', 'e', 'l', 'l', 'o'

}
/*
 * 기본형식 데이터 : 문자형 char
 * 		문자 데이터를 저장하는 2바이트 형식. 정수값 0 ~ 65535 범위 저장도 가능합니다.
 * 		컴퓨터에서 다루는 문자는 문자코드로 처리되는데 코드는 정수값입니다.
 * 		문자데이터는 '' 기호를 사용합니다.
 * 
 * 		영문자, 숫자, 특수문자 외의 다국어문자는 문자를 처리하는 인코딩방식에 따라
 * 		문자코드값이 다릅니다. 국제화 인코딩으로 utf-8 방식을 많이 사용합니다.
 *
 */
