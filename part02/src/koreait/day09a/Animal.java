package koreait.day09a;

public class Animal {
		private String name;
		private String color;
		
		public Animal() {
			System.out.println("���ο� Animal ������ ������ϴ�.");
		}
		
		public void act() {
			System.out.println("Animal �ൿ : ���� ��(Unknown)");
		}
		
		public void print() {
			System.out.println("name : " + name + ", color : " + color);
		}
		
		//object �����ϰ� �ۼ��� �޼ҵ�
		public static boolean isDog(Object object) {
			return object instanceof Dog;
		}
		
		public static boolean isCrow(Object object) {
			return object instanceof Crow;
		}
		
		//getter, setter
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return color;
		}

	}

