package koreait.test;

public class Bike1 extends Product1{
	//e	
	private int speed;
	
	//f
	public Bike1() {
	}
	public Bike1(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	//e
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
