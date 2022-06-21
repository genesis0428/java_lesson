package koreait.day11.test;

public class AnimalTest5 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();

		for(Animal temp : animals)
			if(temp !=null) {
				temp.act();
			}
		
		System.out.println("����ð�................");
		System.out.println(System.currentTimeMillis()+" ms");	//0.001��
		System.out.println(System.nanoTime()         +" ns");	//0.000000001��
		
		//�������� �������...instanceof
		int cnt = 0;	//ī��Ʈ ����
		long start = System.nanoTime();		//���� �ð��� ns(0.000000001��) ������ ����
		System.out.println("������ �����ֱ�......................");
		for(Animal temp : animals) {
			if(temp !=null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100*(cnt+2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("������ �����ִµ� �ɸ� �ð� : " + (end - start) + "ns");
		System.out.println("�������� " + cnt + " ���� ��� �ֽ��ϴ�.");
		
		//�������� �������.... int type �ʵ� �̿��ؼ� �մϴ�.
		start=System.nanoTime();
		System.out.println("������ �����ֱ�............");
		cnt = 0;
		for(Animal temp : animals) {
			if(temp !=null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("���ִ� ����"));
			}
				
		}
		end=System.nanoTime();
		System.out.println("������ �����ִµ� �ɸ� �ð� : " + (end-start) + "ns");
		System.out.println("������ " + cnt + " ���� ��� �ֽ��ϴ�.");
		
		System.out.println("��Ϳ��� �����ֱ�.......................");
		System.out.println(animals[6].eat(animals[3]));
	}
}

class Frog extends Animal{	//������

	protected String mouth; //����Ʈ ������ + �ٸ� ��Ű������ �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���������� frog");
		type=Animal.FROG;
		
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
			System.out.println("Frog �ൿ : ���÷� �����ϱ�");
		}
	
	public String eat(Object object) {
		
		return "unknown : " + object;
	}
}

class Cat extends Animal{	//�����

	protected String eyes;	//����Ʈ ������ + �ٸ� ��Ű������ �ڽ�Ŭ����
	
	public Cat() {
		System.out.println("���ο� ���������� cat");
		type = Animal.CAT;
	}
	
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
		public void act() {
		System.out.println("Cat �ൿ : ���÷� �߿��ϱ�");
		}
	
	public String eat(Object object) {
		
	return null;
	}
}

