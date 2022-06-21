package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C28_IntArrayExDap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number;
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("요소의 값을 입력하세요. >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum+=nums[i];
		}
		avg = (double)sum/nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소의 합 : " + sum);
		System.out.println("입력한 요소의 평균 : " + avg);
		System.out.println();
		
		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + minOfArray(nums));
		
		sc.close();
	}
	
	public static int maxOfArray(int[] nums) {
		int max=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(max<nums[i])	//비교값이 max보다 크다면
				max = nums[i];
				
		}
		//권장 : 출력은 main 에서 실행시킬때 원하는 형식으로 하도록 합시다.	
		return max;							//4.
	}
	public static int minOfArray(int[] nums) {
		int min=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(min>nums[i])
				min = nums[i];

		}
		//권장 : 출력은 main 에서 실행시킬때 원하는 형식으로 하도록 합시다.	
		return min;							//4.
}
}