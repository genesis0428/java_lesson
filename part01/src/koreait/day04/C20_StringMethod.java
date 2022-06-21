package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {

		String message = "hello~";	//java.lang.String (�⺻��Ű�� Ŭ����)

		System.out.println("indexOf('e') = " + message.indexOf('e'));			//1����ġ
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));		//3����ġ
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));		//-1 : ã�� ���ڿ��� ���� ��
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " +test.indexOf("lo"));		// 3��
		System.out.println("test.lastIndexOf(\"lo\") = " +test.lastIndexOf("lo"));	// ��ġ�ϴ� ������ ��ġ 9��
		
		System.out.println("message.substring(2) = " + message.substring(2));	//�κ����� : llo~
		System.out.println("message.substring(2,4) = " + message.substring(2,4));	// ll 2������ 2��(4-2)
		System.out.println("message.replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));	//ġȯ
		System.out.println("startsWith(\"H\") = " +message.startsWith("H"));	// false
		System.out.println("endsWith(\"~\") = " +message.endsWith("~"));		// true
		
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);		// H, e, l, l, o, ~
		System.out.println("charAt(3) = " + temp);		// 0���� �����ؼ� 3�� ���ڰ� �������� ����.
		System.out.println("equals(\"Hello\") = " + isState);	//���ڿ��� ������
	}
	// "�� ����� ������ \(��������) �ʿ��ϴ�. �� "��ȣ�� ���ڿ��������� �ؼ��Ǳ� �����̴�.
}

//String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�,����,���������� �����ؼ� ����մϴ�. 
//���ϰ� ������?		
/*
message.length();		//public int length() : ����
message.charAt(0);		//public char charAt(int index)

message.equals("Hello~");   //public boolean equals(Object anObject) , Object�� ��� Ÿ��
							//message �� String Ÿ���̹Ƿ� Object �� String���� �ؼ��մϴ�.
message.indexOf('e');		//int
message.indexOf("lo");		
message.substring(2);		//String
message.substring(2, 4);
message.replace("ll", "*@");   //String
*/		
//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
