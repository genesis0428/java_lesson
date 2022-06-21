package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;		//문제 갯수
		int[] x1 = new int[10];		//틀린문제 피연산자1 저장할 배열, 문제 갯수 size는 최대 10개라고 가정함
		int[] x2 = new int[10];		//틀린문제 피연산자2 저장할 배열
		int[] no = new int[10];		//틀린문제 번호 저장
		int n1, n2, ans;
		int cnt = 0;
		System.out.println("--------------------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0; i<size; i++) {
			n1 = r.nextInt(89)+11;		// 11 ~ 99
			n2 = r.nextInt(89)+11;		// 11 ~ 99
			System.out.print("문제 " + (i+1) + ". " + n1 + " + " + n2 + " = 답 입력 → ");
			ans = sc.nextInt();
			if(ans != n1 + n2) {
				//3개 배열에 틀린 문제 저장하기
				x1[cnt] = n1;
				x2[cnt] = n2;
				no[cnt] = i+1;
				cnt++;		//틀린문제를 카운트, x1과 x2, no의 배열의 인덱스
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("채점합니다. 맞은 갯수 " + (size-cnt) + " (" + ((size-cnt)*100/size) +" 점)");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		for(int i=0; i<cnt; i++)
			System.out.println("문제 " + no[i] + ". " + x1[i] + " + " + x2[i] + " = " + (x1[i] + x2[i]));
		sc.close();
	}

}
