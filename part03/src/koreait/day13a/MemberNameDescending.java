package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member 객체의 Sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameDescending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		//name 필드 비교
		return o2.getName().compareTo(o1.getName());	//오름차순 : age1 < ag2일때 -1을 리턴
	}
	

}


