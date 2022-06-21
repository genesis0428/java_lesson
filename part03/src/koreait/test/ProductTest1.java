package koreait.test;

public class ProductTest1 {

	public static void main(String[] args) {
		//h
		Product1[] cart = new Product1[5];
		cart[0] = new Bike1(123000, "MTB", 25);
		cart[3] = new Bike1(99000, "삼천리", 15);
		
		//i
		for(Product1 temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
		for(int i=0;i<cart.length;i++)
			if(cart[i]!=null && cart[i].price>=100000)
				System.out.println(cart[i]);
		
		//자식 객체 타입 검사 : instanceOf , (다운)캐스팅
		//메소드 정의 : 리턴값 형식, 인자(매개변수)의 타입과 개수
		
	}

}



		

