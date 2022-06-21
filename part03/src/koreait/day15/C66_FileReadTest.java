package koreait.day15;

import java.io.File;	//io.input,output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FileReadTest {
	public static void main(String[] args) {

		String filename ="C:\\donury05\\�ڹ��׽�Ʈ9.txt";
		
		File file =new File(filename);
		//Scanner : �Է� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try~catch �ʿ��ϴ�.
		Scanner sc  = null;
		try {
			sc = new Scanner(file);		//system.in: ǥ���Է�(�ܼ��Է�)
			
	/*		System.out.println("���Ͽ��� ���� ���� :"+ sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� :"+ sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� :"+ sc.nextLine());
		*/
			while(sc.hasNext()) {	//������ ���͸� �������� ���� �����Ͱ� ������ true
				System.out.println(sc.nextLine());
			}
			
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");	
	}	catch(FileNotFoundException e) {
		//�Է� ��ɿ��� ������ ������ Exception�� �߻��մϴ�.
		System.out.println("����� ���� �߻� : "+ e.getMessage());
	}finally {
	}	if(sc!=null) sc.close();
	}
}
//try~ catch �ڿ����� ���  finally => java 7 ���� ���� ���ο� ���� ������ �����մϴ�.
//		��	 ���õ� �������̽��� ���������� ã�ƺ���
//	���ϰ� ���� �÷����� �յ��!!  ����� ���� �׽�Ʈ �غ�����.
