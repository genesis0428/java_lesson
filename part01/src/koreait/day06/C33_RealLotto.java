package koreait.day06;

import java.util.Arrays;
import java.util.Random;

//�ۼ��� : �̱�ȣ
public class C33_RealLotto {

	public static void main(String[] args) {
		/*
		 * �迭 : �迭 ��ü
		 * �迭 ��� : �迭�� ������ ��
		 */
		
		//ó�� ���� : ���� �ε���+1 �� �ε��� ������ �̰� �ش� ���� �����ϸ� �� ��Ģ�� ������ �ȵ˴ϴ�.
		int[] numbers = new int[45];	//������������ numbers�̰� ũ�Ⱑ 45�� �迭 ���� - ���� ���� �ش�Ǵ� �迭
		Random r = new Random();
		
		for(int i=0;i<45;i++) {		//�ε��� ���� : 0 ~ 44 - ������ ������ ��
			numbers[i]=i+1;			//�� ���� : 1 ~ 45 - lotto �迭�� ����Ǵ� ��
		}
		
		System.out.println("numbers �迭 �ʱⰪ -------------------------------------------------");
		System.out.println(Arrays.toString(numbers));			//numbers �迭 ��� (�ζ� ��ȣ�� �� �� �ִ� ��ȣ ����)
		System.out.println("-----------------------------------------------------------------");
		
		int[] lotto = new int[6];		// ���õ� 6���� ��(�ζ� ��ȣ) �����ϴ� �迭
		int k;							// ���� ���� �ε���
		for(int cnt=0;cnt<6;cnt++) {	//�ε��� ���� : 0 ~ 5	- �ζ� ��ȣ 6���� ���ϱ� ���� for��
			
			k=r.nextInt(45-cnt);											//1~45 45���� ���� �� ������ k���� ����
			//cnt=0,1,2,3,4,5�� ���� ������ bound���� 45,44,43,42,41,40 - �ߺ� ����(Ȯ������ ���� ���̱�)
			//k�� ��������? 0 ~ 44, 0 ~ 43, 0 ~ 42, 0 ~ 41, 0 ~ 40, 0 ~ 39
			
			System.out.println("k = " + k + ", number = " + numbers[k]);	//�ε��� ��ġ�� �ش�Ǵ� ���� �� ��� - ���� ������ �ε����� �׿� �ش��ϴ� ������ ��
			
			lotto[cnt]=numbers[k];	//lotto �迭�� ��Ұ� k�� ������ ���� �ش�� ���ڷ� ���� (ó�� ������ k���� �ش�Ǵ� ���� �������) - numbers�迭���� ������ ���� k�� ���� ���� 
			
			//k��ġ�� ���� ����(����) : �ε��� k + 1 ���� ������ ��ұ��� �������� �̵�
			for(int i=k;i<numbers.length-1;i++) {	// �ε��� k�� ������ ��, �������� �̵��ϸ鼭 ���� - ���õ� �ζ� ��ȣ�� ���� - �ߺ� ����
				numbers[i]=numbers[i+1];
			}
			System.out.println(Arrays.toString(numbers));		//���õ� k�� �ش��ϴ� number�� �� ������ �迭 ���
		}
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));		//���� ������ 6�� �ݺ������ν� ���õ� ���ڵ��� ���
		
		Arrays.sort(lotto);		//lotto �迭���� ũ�� ������� ��ġ�� �����մϴ�.
		System.out.println(Arrays.toString(lotto));		//������������ ���
	}

}
