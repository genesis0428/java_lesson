package koreait.day14;

public class C57_ArraySortEx {
	
	public static void main(String[] args) {

		//�迭�� ����� ���� �����ϱ�� �ڵ带 �����غ���.

			//���� �˰���(��������)
			int[] nums = {34, 77, 19, 56, 45, 9};
			
			for(int i=0; i<nums.length;i++) {	//������ i = nums.length-2
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