package koreait.test;
//ÀÛ¼ºÀÚ : ÀÌ±¤È£
public class CartArray {


	public static void main(String[] args) {
		
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000, "»ïÃµ¸®", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg ³ÃÀå°í");
			
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
	}
}
