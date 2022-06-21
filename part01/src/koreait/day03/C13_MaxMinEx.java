package koreait.day03;

//작성자 : 이광호
import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		int max;
		int min;
		
		//n1, n2, n3의 키보드 입력(사용자입력)
		System.out.print("n1 >>> ");
		n1 = sc.nextInt(); 
		System.out.print("n2 >>> ");
		n2 = sc.nextInt();
		System.out.print("n3 >>> ");
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n", n1, n2, n3);
		

		//n1, n2, n3 중에 최댓값 구하기
		if(n1>n2) {
			max = n1;  min = n2;
		}
		else {
			max = n2;	//max는 임시값
			min = n1;
		}
		
		if (max < n3) max = n3; // 임시 max 값보다 남은 1개 n3이 더 클 때만.	
		if (min > n3) min = n3; // 임시 min 값보다 남은 1개 n3이 더 작을때만.
		System.out.println("max = " + max + " , min = " + min);
		}
	}
	

