package koreait.day07;

import java.util.Random;
import java.util.Scanner;

//작성자 : 이광호
public class C42_Day07Exam {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 풀기");
		System.out.println("--------------------------------------------");
		System.out.println("시작합니다.");
		int count = 0;
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
								// 맞은 갯수
		
		
		for(int i=1;i<=10;i++) {				// 10개 문제
			int A = r.nextInt(90)+10;			// 두자릿수 랜덤 난수 지정
			int B = r.nextInt(90)+10;

		System.out.print("문제 " + i + ". " + A + " + " + B + " = 답 입력 → ");
			int C = sc.nextInt();					// 사용자가 입력한 답

		if(C==A+B) count++;						// 사용자가 입력한 답과 정답 갯수 비교
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("채점합니다. 맞은 개수 " + count + " ( " + (count * 10) + " 점 )" );
		System.out.println("::::: 문제 정답 보기 :::::");

	
	}
}
		
	
		
