package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		Member member1 = new Member(1001, "쵸비");
		Member member2 = new Member(1002, "페이커");
		Member member3 = new Member(1003, "불독");
		
		list.add(member1); // 회원 추가
		list.add(member2);
		list.add(member3);
		list.add(member3);
		
		System.out.println(list.get(0)); // 회원 꺼내기
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0); // 1번째 회원 삭제
		
		System.out.println("전체 회원 수: " + list.size());
		
		// 리스트 출력하기
		System.out.println(list);
		
		//for문을 이용해서 전체 회원 정보 출력하기
		for(int i=0; i<list.size();i++) {
			Member member = list.get(i); // 리스트에서 회원을 꺼냄
			System.out.println(member);
		}
	}

}

// 쇼핑몰 회원
class Member {
	
	int memberId; // 회원 아이디
	String memberName; //회원 이름
	
// 생성자 함수 (클래스이름과 같고 리턴이 없음. 목적: 인스터스 생성 + 멤버변수 초기화)	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

// toString 재정의하기 (주소 대신에 내용을 반환하도록)
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}