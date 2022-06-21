package koreait.day16;

import java.awt.FileDialog;
import java.io.File;		//io : input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

//�о�ü� �ִ� �ؽ�Ʈ ������ ���ڵ��� �¾ƾ��Ѵ�.
//workspace UTF-8 �̸� �ؽ�Ʈ���� UTF-8��
//			MS949 �̸� �ؽ�Ʈ���� ANSI ���ĸ�
public class C67_ResourceClose {

	public static void main(String[] args) {
		//���� ����
		String filename = fileDialogOpen();	// ������ ������ �����ϼ���.
		String filename2 = fileDialogSave();	// ������ ������ ������ ã�ư��� ���ϸ��� ���� ������.
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
		
		try (Scanner sc = new Scanner(ifile); PrintWriter pw = new PrintWriter(ofile)){
			while(sc.hasNext());{
			String temp = sc.nextLine();	//���Ͽ��� �о�� 1��
			System.out.println(temp);		//ǥ�� ���(�ܼ�)
			pw.println(temp);				//���� ���
		}
		System.out.println("���� ���� �Ϸ�");
		}catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
			System.out.println("������ ������ �����ϴ�.");
		}catch(Exception e) {
			System.out.println("�� �� ���� ���� : " + e.getMessage());
		}
		
	}
	
	public static String fileDialogOpen() {
		
		// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
		// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
				
				JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
				
				FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
				fdr.setVisible(true);		//���� ��ȭ���� ���̱�
				
				String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
				System.out.println("������ ��ο� ���� : " + filename);
				System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
				File file = new File(filename);
				System.out.println("������ ���� ũ�� : " + file.length() + "����Ʈ");
				
				
				FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
				fdw.setVisible(true);
				System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());

		
		
		return filename;
	}

public static String fileDialogSave() {
			JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
			
			FileDialog fdw = new FileDialog(f,"���� ����",FileDialog.SAVE);	//���ϴ�ȭ���� ��ü ����
			fdw.setVisible(true);		//���� ��ȭ���� ���̱�
			
			String filename = fdw.getDirectory() + fdw.getFile(); 	//������ ������ ��ο� ���ϸ� ����
			System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
			return filename;
}
}