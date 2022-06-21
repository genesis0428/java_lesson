package koreait.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer {
//token : 표식(최소단위)
//Tokenizer : 토큰화 (최소단위의 표식으로 만들기. 구분기호가 기준)
	public static void main(String[] args) {

		String temp = "모모 90 88 79";
		
		//토큰화 : StringTokenizer 클래스의 기능 사용
		//구분기호는 기본 문자 : 공백, 탭, 줄바꿈
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken 메소드 ");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("hasMoreTokens? " + stk.hasMoreTokens());
		
		//"모모 90 88 79"
		// ↑(토크나이저 포인터, nextToken 메소드 후 위치 이동)
		
		System.out.println("2. 반복문에서 hasMoreTokens 메소드");
		stk = new StringTokenizer(temp);		//토크나이저 객체 다시 생성
		while(stk.hasMoreTokens()) {			//다음에 읽어올 토큰이 있으면
			System.out.println(stk.nextToken());
		}
		
		System.out.println("3. 여러가지 구분기호 사용하기");	//empty는 만들지 않습니다. (split 과의 차이점)
		temp = "모모,90 88()79";
		stk = new StringTokenizer(temp, " ,()");	//두번쨰 인자는 delimiter : 구분기호 문자를 나열합니다. (정규식 아닙니다.)
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		System.out.println("4. 토큰화 데이터로 객체 만들기");
		temp = "모모 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
		}
		
		System.out.println("생성된 Score 객체 : " + score);
		System.out.println("총점 : " + score.sum());
		System.out.println("평균 : " + score.average());
		System.out.println("학점 : " + score.getGrade());
		
		//List로 만들기
		temp = "모모 90 88 79\n나나 78 83 79\n신비 92 73 66";
		stk = new StringTokenizer(temp);					//토크나이저는 빈(empty) 요소에 대한 처리를 하지만 split은 하지 못한다.
		List<Score> scores = new ArrayList<>();
		while(stk.hasMoreElements()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			scores.add(score);
		}
		System.out.println("토큰나이저 결과 : " + scores);
		
		scores.clear();			//리스트의 모든 요소를 삭제하기
		
		//split 메소드 실행결과를 어떻게 객체로 만들수 있을까요?
		String[] result = temp.split("[ \n]");
		for(int i=0;i<result.length;i+=4) {	//+=4인 이유 (모모 90 88 79) (나나 78 83 79) (신비 92 73 66)
			Score s = new Score(result[i+0],		//이름
					Integer.parseInt(result[i+1]),	//국어
					Integer.parseInt(result[i+2]),	//영어
					Integer.parseInt(result[i+3])	//과학
					);
			scores.add(s);
		}
		System.out.println("split 메소드 결과 : " + scores);
	}

}
