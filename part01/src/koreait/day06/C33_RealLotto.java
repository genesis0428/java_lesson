package koreait.day06;

import java.util.Arrays;
import java.util.Random;

//작성자 : 이광호
public class C33_RealLotto {

	public static void main(String[] args) {
		/*
		 * 배열 : 배열 전체
		 * 배열 요소 : 배열의 각각의 값
		 */
		
		//처음 상태 : 값을 인덱스+1 → 인덱스 난수를 뽑고 해당 값을 삭제하면 이 규칙은 적용이 안됩니다.
		int[] numbers = new int[45];	//참조변수명이 numbers이고 크기가 45인 배열 선언 - 뽑힐 공에 해당되는 배열
		Random r = new Random();
		
		for(int i=0;i<45;i++) {		//인덱스 범위 : 0 ~ 44 - 난수로 뽑히는 값
			numbers[i]=i+1;			//값 범위 : 1 ~ 45 - lotto 배열에 저장되는 값
		}
		
		System.out.println("numbers 배열 초기값 -------------------------------------------------");
		System.out.println(Arrays.toString(numbers));			//numbers 배열 출력 (로또 번호가 될 수 있는 번호 나열)
		System.out.println("-----------------------------------------------------------------");
		
		int[] lotto = new int[6];		// 선택된 6개의 값(로또 번호) 저장하는 배열
		int k;							// 뽑힐 값의 인덱스
		for(int cnt=0;cnt<6;cnt++) {	//인덱스 범위 : 0 ~ 5	- 로또 번호 6개를 구하기 위한 for문
			
			k=r.nextInt(45-cnt);											//1~45 45개의 난수 중 임의의 k값을 선정
			//cnt=0,1,2,3,4,5에 대해 난수의 bound값은 45,44,43,42,41,40 - 중복 방지(확률적인 범위 줄이기)
			//k의 난수범위? 0 ~ 44, 0 ~ 43, 0 ~ 42, 0 ~ 41, 0 ~ 40, 0 ~ 39
			
			System.out.println("k = " + k + ", number = " + numbers[k]);	//인덱스 위치에 해당되는 숫자 값 출력 - 뽑힌 숫자의 인덱스와 그에 해당하는 숫자의 값
			
			lotto[cnt]=numbers[k];	//lotto 배열의 요소가 k값 선택을 통해 해당된 숫자로 구성 (처음 선택한 k값에 해당되는 숫자 순서대로) - numbers배열에서 난수로 뽑힌 k의 값이 저장 
			
			//k위치의 값을 제거(삭제) : 인덱스 k + 1 부터 마지막 요소까지 왼쪽으로 이동
			for(int i=k;i<numbers.length-1;i++) {	// 인덱스 k를 삭제할 때, 왼쪽으로 이동하면서 삭제 - 선택된 로또 번호를 제외 - 중복 방지
				numbers[i]=numbers[i+1];
			}
			System.out.println(Arrays.toString(numbers));		//선택된 k에 해당하는 number를 뺀 나머지 배열 출력
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));		//앞의 과정을 6번 반복함으로써 선택된 숫자들을 출력
		
		Arrays.sort(lotto);		//lotto 배열값의 크기 순서대로 위치를 변경합니다.
		System.out.println(Arrays.toString(lotto));		//오름차순으로 출력
	}

}
