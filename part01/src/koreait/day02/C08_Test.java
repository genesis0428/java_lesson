package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		
		int width = 23;
		int height = 19;
		int box_area = width * height;
		
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ� : " + box_area + "��");
		
		System.out.println("=============================");
		
		System.out.println("[[���� �ѷ��� ���߽��ϴ�.]]");
		
		double half = 23.230;
		double round = 2 * 3.14 * half; //�ѷ�
		double circle_area = 3.14 * half * half; //����
		
		System.out.printf("������ : %.3f�� \n",half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f �� \n", round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n", circle_area);
		
		
		//final �׽�Ʈ
		//		���� ���� �տ� final Ű���带 ���̸� ���� ������ �� ����.
		
		final int test = 123;		//���� ������ϴ� ����Դϴ�.
		System.out.println("test =" + test);
		

	}

}
