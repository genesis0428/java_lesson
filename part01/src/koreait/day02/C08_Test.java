package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		System.out.println("[[사각형 도형의 넓이 구하기]]");
		
		int width = 23;
		int height = 19;
		int box_area = width * height;
		
		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + height + "㎝");
		System.out.println("넓이를 구했습니다 : " + box_area + "㎠");
		
		System.out.println("=============================");
		
		System.out.println("[[원의 둘레를 구했습니다.]]");
		
		double half = 23.230;
		double round = 2 * 3.14 * half; //둘레
		double circle_area = 3.14 * half * half; //넓이
		
		System.out.printf("반지름 : %.3f㎝ \n",half);
		System.out.printf("둘레를 구했습니다 : %.3f ㎝ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f ㎠ \n", circle_area);
		
		
		//final 테스트
		//		변수 선언 앞에 final 키워드를 붙이면 값을 변경할 수 없다.
		
		final int test = 123;		//값을 변경못하는 상수입니다.
		System.out.println("test =" + test);
		

	}

}
