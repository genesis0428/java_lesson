package koreait.day05;
import java.util.Arrays;
//�ۼ��� : �̱�ȣ
import java.util.Scanner;

public class C28_IntArrayEx {

	/* 1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�, ����� ���մϴ�. �� �հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ��ϼ���.
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 			��maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ������ int
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg=0;
		
		int[] nums = new int[5];	//1�� �׸�
		for(int i=0; i<5; i++) {
			System.out.printf((i+1)+"��° ��� ���� �������ּ���. : ");
			nums[i]=sc.nextInt();
			String t = Arrays.toString(nums);
			System.out.println(t); 	//2�� �׸�
			}
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			System.out.println("sum : " + sum);
			}
		avg=sum/nums.length;
		System.out.println("avg : " + avg);	//3�� �׸�
		
		int max = maxOfArray(nums);
		System.out.println("�迭 nums �ִ밪 max = " + max);
		
		int min = minOfArray(nums);
		System.out.println("�迭 nums �ּڰ� min = " + min);
	}
	
	//max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ�մϴ�.
	//�迭��� 1������ ��������ұ��� max, min�� ������� ���ؼ� �� for��
	//max�� �� ������ ������(min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
	//�� �񱳰� ������ max, min�� �����˴ϴ�.


	public static int maxOfArray(int[] nums) {
		int max=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(max<nums[i])
				max = nums[i];

		}
		//���� : ����� main ���� �����ų�� ���ϴ� �������� �ϵ��� �սô�.	
		return max;							//4.
	}
	public static int minOfArray(int[] nums) {
		int min=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(nums[i]<min)
				min = nums[i];

		}
		//���� : ����� main ���� �����ų�� ���ϴ� �������� �ϵ��� �սô�.	
		return min;							//4.
	}
}
