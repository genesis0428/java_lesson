package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {

		String best;	//특기과목명 참조할 변수
		Scanner sc = new Scanner(System.in);
		int max;
		
		int 국어, 영어, 수학;
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println();
		System.out.println("성적 입력하세요.");
		
		System.out.println("국어 → ");
		국어 = sc.nextInt();
		System.out.println("영어 → ");
		영어 = sc.nextInt();
		System.out.println("수학 → ");
		수학 = sc.nextInt();
		System.out.println();

		System.out.println("처리되었습니다. >>");
		System.out.println("총점 : " + (국어 + 영어 + 수학));
		System.out.println("평균 : " + ((국어+영어+수학)/3) + ",\t과목수 : 3");
		System.out.println();
		if(국어 > 영어) {
			max = 국어;
			best = "국어";
		}else {
			max = 영어;
			best = "영어";
		}
		if (max < 수학) {
			max = 수학;
			best = "수학";
		}
		System.out.printf("이 학생의 특기 과목은  %s(%d)입니다.", best, max);
		sc.close();
	}

}
