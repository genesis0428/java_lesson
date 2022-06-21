package koreait.day16;

import java.io.File;		//io : input, output 입출력 관련된 기능들의 클래스
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C68_FileReadWrite {

	public static void main(String[] args) throws FileNotFoundException{
		
		String filename = "C:\\IT Class\\자바테스트0617.txt";		
		try {
		fileWrite(filename);
//		filename = "C:\\IT Class\\자바테스트0618.txt";
		fileRead(filename);
	}catch(FileNotFoundException e) {
		System.out.println("사용자 실행 오류 : " + e.getMessage());
		System.out.println("파일이 존재하는지 확인하세요.");
	}
}
	
	//방법 1 : Execution을 try ~ catch로 직접처리합니다.
	public static void fileWrite(String filename) {
		
		File file = new File(filename);
		//PrintWriter : 출력 기능을 갖는 클래스
		PrintWriter pw = null;
		try {
		pw = new PrintWriter(file);	//file 로 지정된 위치에 출력을 위한 객체
		pw.println("모모 90 89 82");
		pw.println("다현 89 90 82");
		pw.println("나연 82 89 90");
		System.out.println("파일 출력이 완료되었습니다.");	//System.out : 표준 출력
	} catch (FileNotFoundException e) {
		//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
		System.out.println("사용자 오류 발생 : " + e.getMessage());
	}finally {
		pw.close();
	}

}
	//방법2 : throws 키워드는 해당 Exception 처리를 호출한 곳(여기서는 main 메소드)으로 넘긴다(떠넘긴다)
	//		 throws 뒤에, 로 구분해서 여러개를 지정할 수 있습니다.
	//		 Exception 처리해야할 메소드가 많이 정의되고 사용될 떄 한곳에서 모두 처리할 수 있습니다.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		PrintWriter pw = null;
		pw = new PrintWriter(file);	//file 로 지정된 위치에 출력을 위한 객체
		pw.println("모모 90 89 82");
		pw.println("다현 89 90 82");
		pw.println("나연 82 89 90");
		System.out.println("파일 출력이 완료되었습니다.");	//System.out : 표준 출력
		pw.close();
	}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}		