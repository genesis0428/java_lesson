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
			System.out.print("����� ���� �Է��ϼ���. >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum+=nums[i];
		}
		avg = (double)sum/nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("�Է��� ����� �� : " + sum);
		System.out.println("�Է��� ����� ��� : " + avg);
		System.out.println();
		
		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + minOfArray(nums));
		
		sc.close();
	}
	
	public static int maxOfArray(int[] nums) {
		int max=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(max<nums[i])	//�񱳰��� max���� ũ�ٸ�
				max = nums[i];
				
		}
		//���� : ����� main ���� �����ų�� ���ϴ� �������� �ϵ��� �սô�.	
		return max;							//4.
	}
	public static int minOfArray(int[] nums) {
		int min=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(min>nums[i])
				min = nums[i];

		}
		//���� : ����� main ���� �����ų�� ���ϴ� �������� �ϵ��� �սô�.	
		return min;							//4.
}
}