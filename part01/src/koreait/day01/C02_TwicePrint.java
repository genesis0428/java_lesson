package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("----------------------------------------");
		System.out.println("사나\t1996.12.29\t27");		// 한개 문자열을 출력
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		
		//printf()메소드 사용해서 출력형식을 지정
		//12칸 문자열 + 자릿수 지정하지 않은 문자열 + 5칸 정수
		//%s는 지정된 칸에서 오른쪽 맞춤, -는 왼쪽맞춤
		System.out.println();
		
		System.out.printf("%-12s%s%5d\n", "dayeon", "1998.05.28",25);
		System.out.printf("%-12s%s%5d\n", "momo", "1999.04.23",24);
		System.out.printf("%-12s%s%5d\n", "nayon", "1997.06.14",27);
		
		//printf 메소드에서 형식문자 갯수만큼 뒤에 따라나오는 데이터 형식과 갯수가 일치해야한다.
		//System.out.printf("%-12s%s%5d\n", "nayon", "1997.06.14");
		
		//printf 메소드에서 형식문자와 뒤에 나오는 데이터 형식이 일치하지 않아도 오류가 발생한다.
		//System.out.printf("%-12s%5d\n", "nayon", "1997.06.14");
		
		//연습 : system.out.printf("%12s%s%5d\n", "dayeon", "1998.05.28",25);
		// ㄴ 생년월일 "1998.05.28"을 정수형식(데이터)로 출력하도록 수정해봅시다.
		System.out.println();
		
		System.out.println("//////연습//////");
		System.out.println();
		
		System.out.printf("%12s%4d.%2d.%2d%5d\n", "dayeon", 1998,5,28,25);
		System.out.printf("%-12s%4d.%2d.%2d%5d\n", "momo", 1999,11,23,24);
		System.out.printf("%-12s%4d.%2d.%2d%5d\n", "nayon", 1997,6,3,25);
		
		System.out.println();
		
		System.out.printf("%12s%4d.%02d.%02d%5d\n", "dayeon", 1998,5,28,25);
		System.out.printf("%-12s%4d.%02d.%02d%5d\n", "momo", 1999,11,23,24);
		System.out.printf("%-12s%4d.%02d.%02d%5d\n", "nayon", 1997,6,3,25);
		//여기까지는 데이터를 직접 리터럴("momo", 1998, true...) 로 표현해서 출력
		
		//진도 방향 : 변수(데이터를 저장하고 있는 기억 장소 이름) 사용
//		System.out.printf("-12s %4d.%2d %5d\n", name,year,month,day,age);
		
	}
	
/*
 * 출력에 사용되는 형식
 * 
 *\(역슬래쉬) 사용하는 이스케이프문자 : \n(줄바꿈) , \t(tab)
 *형식지정문자 %기호 사용 : %s(문자열) , %d(정수) 자릿수를 지정해서 쓸 수 있음.
 *								ㄴ 남은 자리를 0으로 채우고 싶을 때는 %03d와 같이 한다.
 */

}
