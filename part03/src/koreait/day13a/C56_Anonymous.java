package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
// �������̽� ����ü�� �͸� ���� Ŭ������ �����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("I am Anonymous.!!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("�͸� InterfaceA methodA");
			}
		};
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				// TODO Auto-generated method stub
				return "�͸� ���� Ŭ���� : " + name;
			}
		};
		
		ia.methodA();
		ia.methodD("����~ �������̽�");
		InterfaceA.methodC();
		System.out.println("��� : " + InterfaceA.SIZE);
		
		System.out.println(ib.name("�׽�Ʈ"));
		}
	}
