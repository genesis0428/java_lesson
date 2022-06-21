package koreait.test;
//¿€º∫¿⁄ : ¿Ã±§»£
public class ProductTest {

	public static void main(String[] args) {

	}

}

class Electronics extends Product{

	private double kwh;
	
	public Electronics() {
	}
	public Electronics(int price,String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
	
	@Override
	public String sell(Object obj) {
		return String.format("π≠¿Ω ªÛ«∞ - %s(1set)", obj);
	}

	
	public double getKwh() {
		return kwh;
	}
	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	public double power() {
		double power = kwh*24;
		return power;
	}
	
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
}
