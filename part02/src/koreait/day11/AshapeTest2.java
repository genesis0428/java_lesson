package koreait.day11;

import koreait.day09a.Animal;

public class AshapeTest2 {
	
	//�͸� Ŭ���� : anonymous. �̸��� ���� Ŭ����
	public static void main(String[] args) {

		//line(��)
		//�͸� ����(Inner) Ŭ���� ����. 1ȸ�� Ŭ���� ����(�߻�޼ҵ� ������ �ʼ�)
		Ashape sha = new Ashape() {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};
		
		Ashape sha2 = new Ashape(20, 13) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width + height;
			}
		};
		
		System.out.println("sha ���� = " + sha.getArea());
		System.out.println("sha2 ���� = " + sha2.getArea());
		
		//���� : �߻�Ŭ���� �ƴҋ��� �޼ҵ� �������ؼ� ���� �͸�Ŭ����ó�� �� �� �ֳ�?
		//Ȯ���ϱ�	//�� : �����ϴ�. �׷��� ������ �߻�޼ҵ� �������ϸ� �͸�Ŭ���� ���� ���ϴ�.
		
		Animal snake = new Animal() {
			int length;
			
			@Override
			public void act() {
			setName("�̱��Ƴ�");
			setColor("�����");
			length = 3;
			System.out.println("action : ���ٴϱ�");
		
		}
			
			@Override
			public String toString() {
				return "length = " + length;
	}

};
		snake.act();
		System.out.println(snake);
	}
}
