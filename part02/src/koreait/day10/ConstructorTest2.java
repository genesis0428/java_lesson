package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

	}

}

class Product2 {
	int price;
	
	//부모클래스 디폴트 생성자 정의해서 자식클래스가 
	//사용할 수 있도록 합니다.
	public Product2() {
		
	}
	public Product2(int price) {
		this.price=price;
	}
}

class Food2 extends Product2 {
	// Food2 디폴트 생성자는 자동으로 동작
	// 부모클래스 Product2 디폴트 생성자 super()가 호출 - super는 숨어있음
	
	
}

class Electronics2 extends Product2 {	
	
	public Electronics2(int price) {
		super(price);	//부모클래스 커스텀 생성자 실행
	}
	

	
}