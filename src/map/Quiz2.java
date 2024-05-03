package map;

import java.util.HashMap;

public class Quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		// 추가
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		System.out.println(map);
		
		// 수정
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		System.out.println("점수 수정 : " + map);
		
		// 삭제
		map.remove("영어");
		System.out.println("영어 삭제 : " + map);
		
		// 요소 하나씩 출력
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		
		// 저장된 요소를 한번에 출력
		System.out.println("한번에 출력 : " + map);
		
		// 크기
		System.out.println(map.size());
	}

}
