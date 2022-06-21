package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니가? (1~5) >>> "); // → 2
		int count = sc.nextInt();
		
		System.out.println("방법 1");
		for(int i=0; i<count; i++)
			System.out.print("★");
	
		
		
		System.out.println("\n\n방법 2");
		for(int i=0;i<count;i++)
			System.out.print("★");
		for(int i=0;i<5-count;i++)
			System.out.print("☆");		//출력횟수 : 5-count
		
		
		
		System.out.println("\n\n방법 2_");
		for(int i=0; i<5; i++)
			if(i<count)
				System.out.print("★");		//3개
			else		
				System.out.print("☆");		//2개
		
		
		
		System.out.println("\n\n방법 2__");
		int k;				//loop counter 변수가 main 메소드의 지역변수
		for(k=0;k<count;k++)	//count = 3
				System.out.print("★");		

//		System.out.println("k="+k); //k=?
		for(;k<5;k++)			//k의 값은 얼마부터? k는 count부터
			System.out.print("☆");

		
		
		sc.close();
	}

}
