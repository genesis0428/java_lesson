package koreait.day09a;

public class Dog extends Animal{

	protected int legs;	//디폴트 한정자 + 다른 패키지에서 자식클래스
	
	public Dog() {
		System.out.println("새로운 동물가족은 dog");
	}
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
	}

	}