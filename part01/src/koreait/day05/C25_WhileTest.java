package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {

//		//비교
//		for(int i=0;i<5;i++)
//			System.out.println("hello!("+(i+1)+")");
//			System.out.println();
//			
//			
//		//while문 형식
//		//loop counter 변수 선언&초기값
//		int j = 0;
//		while(j<5) {//조건식
//			System.out.println("hello!("+(j+1)+")");
//			j++;	//증감식
//		}
//		
//		
		// 예시 : for문은 1~100까지 더하는 연속적인 값을 대상으로 할 때 적합
		// 		while문은 아직 정해지지 않은 값들을 대상으로 할 때 적합 
		//		반복문과 함꼐 사용하는 명령문 - break, continue(continue 뒤의 명령들을 실행하지 않고 반복 처음으로 돌아간다)
		int k=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수를 모두 더하는 계산기입니다.(종료:-1)");
		while(k!=-1) {	//k가 -1이 아닌 동안 반복실행
			System.out.print("정수 입력 >>> ");
			k=sc.nextInt();
			if(k!=-1)
				sum +=k;	//sum=sum+k;
		}
		
		System.out.println("sum = " + sum);
		
		sum=0;
		k=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.[ver2.0](종료:-1)");
		do {
			sum+=k;
			System.out.print("정수 입력 >>> ");
			k=sc.nextInt();
		}while(k!=-1);	//조건을 뒤에서 감시하는 명령문입니다.
		System.out.println("sum = " + sum);
		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.[ver2.1](종료:-1)");
		
		while(true) {
			System.out.print("정수 입력 >>> ");
			k=sc.nextInt();
			
			if(k==-1)break;			//항상 첨일때, 탈출(종료) 조건과 break문 사용합니다.
			sum+=k;
		}
		System.out.println("sum = " + sum);
		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.[ver2.2](종료:-1)");
		boolean isState = true;
		while(isState) {
			System.out.print("정수 입력 >>> ");
			k=sc.nextInt();
			
			if(k==-1) isState=false;
			else sum+=k;
		}
		System.out.println("sum = " + sum);
		
		
		//continue 연습 : 입력된 값이 10의 배수이면 sum을 더하지 않고 다시 입력

		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.[연습](종료:-1)");
		while(true) {
			System.out.print("정수 입력 >>> ");
			k=sc.nextInt();
			
			if(k==-1)break;
			if(k%10==0)continue; //아래 명령어 실행하지 않고 다시 처음으로 반복
			sum+=k;
		}
		System.out.println("sum = " + sum);
		sc.close();
	}

}
