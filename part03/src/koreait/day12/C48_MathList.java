package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제 리스트로 변경하기	//작성자 : 이광호
public class C48_MathList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;	//문제 개수
		ArrayList<MathProblem> list = new ArrayList<MathProblem>();
		int ans;	int cnt = 0;
		System.out.println("--------------------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0; i<size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("문제 " + (i+1) + ". " + temp.getN1() + " + " + temp.getN2() + " = 답 입력 → ");
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			// problems[i]=temp ?????	//배열 인덱스 i에 temp 객체 참조값을 더해라.
			list.add(temp);
			
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("채점합니다. 맞은 갯수 " + cnt + " (" + (cnt*100/size) +" 점)");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		for(int i=0; i<list.size(); i++)
			if(list.get(i).isCorrect()==false)	//틀렸을 때
			if(!list.get(i).isCorrect())	
			System.out.println("문제 " + (i+1) + ". " + list.get(i).problem() + list.get(i).showAnswer()); 
    }
}