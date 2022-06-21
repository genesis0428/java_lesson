package koreait.day05;
import java.util.Arrays;
//작성자 : 이광호
import java.util.Scanner;

public class C28_IntArrayEx {

	/* 1. int 배열크기 5를 선언하세요. 이름은 nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계, 평균을 구합니다. → 합계는 2번에서 입력받는 for문 안에서 수식 작성하세요.
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * 			ㄴmaxOfArray, minOfArray : 인자는 int 배열, 반환값형식 int
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg=0;
		
		int[] nums = new int[5];	//1번 항목
		for(int i=0; i<5; i++) {
			System.out.printf((i+1)+"번째 요소 값을 지정해주세요. : ");
			nums[i]=sc.nextInt();
			String t = Arrays.toString(nums);
			System.out.println(t); 	//2번 항목
			}
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			System.out.println("sum : " + sum);
			}
		avg=sum/nums.length;
		System.out.println("avg : " + avg);	//3번 항목
		
		int max = maxOfArray(nums);
		System.out.println("배열 nums 최대값 max = " + max);
		
		int min = minOfArray(nums);
		System.out.println("배열 nums 최솟값 min = " + min);
	}
	
	//max, min 변수를 각각 배열의 0번 요소값으로 초기화합니다.
	//배열요소 1번부터 마지막요소까지 max, min과 순서대로 비교해서 → for문
	//max가 그 값보다 작으면(min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
	//→ 비교가 끝나면 max, min이 결정됩니다.


	public static int maxOfArray(int[] nums) {
		int max=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(max<nums[i])
				max = nums[i];

		}
		//권장 : 출력은 main 에서 실행시킬때 원하는 형식으로 하도록 합시다.	
		return max;							//4.
	}
	public static int minOfArray(int[] nums) {
		int min=nums[0];	//1.
		for(int i=0;i<nums.length;i++) {	//2.
			if(nums[i]<min)
				min = nums[i];

		}
		//권장 : 출력은 main 에서 실행시킬때 원하는 형식으로 하도록 합시다.	
		return min;							//4.
	}
}
