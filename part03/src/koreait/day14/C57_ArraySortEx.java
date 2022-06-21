package koreait.day14;

public class C57_ArraySortEx {
	
	public static void main(String[] args) {

		//배열에 저장된 값을 정렬하기는 코드를 구현해보자.

			//정렬 알고리즘(오름차순)
			int[] nums = {34, 77, 19, 56, 45, 9};
			
			for(int i=0; i<nums.length;i++) {	//마지막 i = nums.length-2
				for(int k=i+1;k<nums.length;k++) {	
					if(nums[i] > nums[k]) {
						int temp = nums[i];
						nums[i] = nums[k];
						nums[k] = temp;
					}
				}
			}
			
			for (int i=0;i<nums.length;i++) {
				System.out.printf("%5d", nums[i]);
			}
		}
	}