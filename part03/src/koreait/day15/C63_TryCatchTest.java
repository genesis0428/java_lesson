package koreait.day15;

import java.util.InputMismatchException;

public class C63_TryCatchTest {

	public static void main(String[] args) {
		//try ����
		try {
			//Exception ���ɼ��� �ִ� ����� �ۼ� -> ������ ����� catch�� ���ϴ�.
			//�� ��ġ���� ���� �����ϸ� try {}�� ��������
		}catch(NullPointerException e) {	//���� ���ο� ���� Exception ������ �˻��մϴ�.
			//NullPointerException �϶��� �Ʒ� ��ɵ� ó���մϴ�.
			e.printStackTrace();	//������ �����ϱ� ���� ������ ���(���� Exception ��� ����)
		} catch(InputMismatchException e) {
			// catch�� ������ �ۼ� �����մϴ�.
		}
		finally {	//����������, ���������� : ���� �߻� ������� ����Ǵ� �κ��̺��.
				//�ַ� �ڿ��� �����ϴ� �ڵ� �ۼ��մϴ�.
		}
		
		//try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��ӵ˴ϴ�.
	}

}
