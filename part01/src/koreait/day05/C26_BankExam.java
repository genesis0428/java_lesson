package koreait.day05;

import java.util.Scanner;

/*
 * GUI : Graphic User Interface	(사용자 명령을 아이콘, 메뉴 방식으로 처리)
 * CLI : Command Line Interface	(사용자 명령을 텍스트로만 처리)
 */

public class C26_BankExam {

	// CLI 방식의 메뉴 선택을 while문으로 연습
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;						//반복을 제어할 변수
		int sel;								//선택 사항 저장
		int balance = 0;						//잔고(잔액)
		
		while(run) {	//초기값은 참
			int money;	//while문은 지역변수. 입금액과 출금액 저장
			System.out.println("--------------------------------------");
			System.out.println(" 1 : 예금 | 2 : 출금 | 3 : 잔고 확인 | 4 : 종료");
			System.out.println("--------------------------------------");
			System.out.print("메뉴 선택 >>> ");
			sel = sc.nextInt();
			
			switch(sel) {
					case 1 : // 예금 처리(예금금액입력 → 잔액에 더하기)
						System.out.println("예금액 > ");
						money = sc.nextInt();
						balance +=money;
						
						System.out.println("고객님의 잔액은 "+ balance + "원 입니다.");
						System.out.println();
						break;
					case 2 : // 출금 처리(출금금액입력 → 잔액보다 많지 않을 때 처리 (잔액에서 빼기))
						System.out.println("출금액 > ");
						money = sc.nextInt();
						if(balance<money) 
							System.out.println("잔액이 부족합니다. 다시 확인해주세요.");
						else
							balance -= money;
						System.out.println("고객님의 현재 잔액은 "+ balance + "원 입니다.");
						System.out.println();
						break;
					case 3 :	// 잔고(balance) 출력
						System.out.println("현재 잔고는 " + balance + "원 입니다.");
						System.out.println();	//줄바꿈
						break;
					case 4 :	//반복 종료
						System.out.println("프로그램을 종료합니다.");
						run=false;		//switch 안에서 break로 while 탈출할 수 없습니다.
						break;
					default :	//1,2,3,4 외 나머지 값일 때
						System.out.println("잘못된 선택입니다. 값은 1부터 4까지 입력 가능합니다.");
						
					sc.close();
		}
	}

}
}