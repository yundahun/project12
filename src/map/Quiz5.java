package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
		
		MemberHashMap hashMap = new MemberHashMap();
			
			Member member1 = new Member(1001, "둘리");
			Member member2 = new Member(1002, "또치");
			Member member3 = new Member(1003, "도우너");
			Member member4 = new Member(1004, "고길동");
			
			hashMap.addMember(member1);
			hashMap.addMember(member2);
			hashMap.addMember(member3);
			hashMap.addMember(member4);
			
			hashMap.showAllMember();
			
			System.out.println("MemberHashMap에 1004번 회원이 있으면 삭제하세요!");
			
			hashMap.removeMember(1004);
			hashMap.showAllMember();
			
	}

}

class MemberHashMap {
	
	HashMap<Integer, Member> map;
	
	public MemberHashMap() {
		map = new HashMap<>(); // 맵 생성
	}
	
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	public void removeMember(int memberId) {
			if (map.containsKey(memberId)) {
				map.remove(memberId);
				System.out.println(memberId + "번 회원을 삭제하였습니다.");
				return;
			}
			System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		}
	
	
	public void showAllMember() {
		
		Collection<Member> values = map.values();
		
		for(Member member : values) {
			System.out.println(member);
		}
		System.out.println();
	}
}