package collection;

import java.util.ArrayList;

/*
 * Character타입의 ArrayList 생성
 * 문자 3개 추가 ('A','B','C')
 * 리스트의 요소를 하나씩 출력
 * 리스트의 두번째 문자 B를 삭제
 * 리스트의 크기를 출력
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		Character character1 = new Character('A');
		Character character2 = new Character('B');
		Character character3 = new Character('C');
		
		list.add(character1);
		list.add(character2);
		list.add(character3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		
		System.out.println(list.size());
		
		//for문을 이용해서 전체 회원 정보 출력하기
//		for(int i=0; i<list.size();i++) {
//		
//			Character ch = list.get(i); // 리스트에서 회원을 꺼냄
//			
//			if(ch == 'A') {
//				list.remove(i);
//			}
//			
//			System.out.println(ch);
//
//		}
	}
}

class Character {
	
	char eng;

	public Character(char eng) {
		super();
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Character [eng=" + eng + "]";
	}


}