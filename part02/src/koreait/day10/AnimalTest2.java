package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();		//��ĳ���� : �θ� �ڽ��� ���� - �ڵ�ĳ���� <-> �ٿ�ĳ���� : ������ȯ
		Animal ani2 = new Cat();
		
		Dog puddle = new Dog();			
		Crow crow = new Crow();
		//�ڽ� ��ü�� ������ �� ���� �θ� Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����

		//��ü ���������� : ���޵Ǵ� ���� ��ü�� �ּ�
		System.out.println(":::::::::");
//		animal(ani1);
//		animal(ani2);
		animal(puddle);
//		animal(crow);
//		animal(new Frog());
	}

		//������ : ������ 1�����ε� ���ԵǴ� ����� �پ�
		//���� ���� 1 : �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal : Animal, Dog, Crow, Frog, Cat ��ü ��� ����
	public static void animal(Animal animal) {
		//���� ���� 2 : �޼ҵ� ������
		animal.act();
		
		
		animal.print();
		//���ڷ� ������ ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻� : instanceof
		System.out.println("dog? " + (animal instanceof Dog));	//��ü�������� instanceof Ŭ������
		System.out.println("crow? " + (animal instanceof Crow));
		System.out.println("frog? " + (animal instanceof Frog));
		System.out.println("cat? " + (animal instanceof Cat));
		
/*
 * Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.		
		animal.jump();	//Frog
		animal.run();	//Dog
		animal.fly();	//Crow
		animal.sound();	//Cat
*/
	
//		Cat cat = (Cat)animal;		

		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal;		//�ٿ�ĳ����: animal ��¥ ��ü�� �����̳Ŀ� ���� ������ �ɼ���, �ȵɼ��� �ִ�.
			cat.sound();
		}	
		
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
		}
		
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();
		}
		
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();
	}
		animal.print();
	}
}

class Frog extends Animal{	//������

	protected String mouth; //����Ʈ ������ + �ٸ� ��Ű������ �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���������� frog");
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷϻ�");
		System.out.println("Ư¡ : ����");
	}
	
	//������ ���� : �޼ҵ� �������̵�						*�� : �����ε�(overloading) - ���� ã�ƺ���(�򰥸��� ����)*
	@Override		//annotation �ֳ����̼� : �ڵ�(�Ǵ� ����) �� �� ���� �Ǵ� �ּ�
		public void act() {
//			super.act();	//�θ�Ŭ������ act() ����
			System.out.println("Animal �ൿ : ���÷� �����ϱ�");
		}
}

class Cat extends Animal{	//�����

	protected String eyes;	//����Ʈ ������ + �ٸ� ��Ű������ �ڽ�Ŭ����
	
	public Cat() {
		System.out.println("���ο� ���������� cat");
	}
	
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
		public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿��ϱ�");
		}
}