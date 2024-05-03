package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");
		
		// 리스트와 삭제 방법이 다름
		hashSet.remove("도우너"); // 인덱스가 없기 때문에 값을 줌.
		
		//Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator();
		
		while(ir.hasNext()) { // 다음 요소가 있으면
		
			String member = ir.next(); // 다음요소를 가져옴
			System.out.print(member + " ");
			} 
	
		// 일반 포문 - index 필요함
		// 람다식 포문
		// 값을 저장할 변수 : 자료구조
		for(String member : hashSet) {
			System.out.println(member + " ");
		}
		
//	while(true) { // 다음 요소가 있으면
//			
//			if(ir.hasNext() == true) {
//			String member = ir.next(); // 다음요소를 가져옴
//			System.out.print(member + " ");
//			} else {
//				break;
//			}
//		}
		
	}
}