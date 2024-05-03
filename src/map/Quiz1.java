package map;

import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<>();
		
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		map.get('b');
		System.out.println(map);
		
		map.replace('b', "블루베리");
		System.out.println(map);
		
		map.remove('a');
		System.out.println(map);
		
		// 특정 키값이 존재하는지 확인하기!
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 없습니다");
		}
		
	}

}
