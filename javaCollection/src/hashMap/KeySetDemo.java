package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		// String 타입의 키와 Integer 타입의 밸류로 이뤄진 맵
		// Map은 인터페이스, HashMap은 Map을 구현한 클래스
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("김연아", new Integer(98)); // int 타입은 맵에 들어올 수 없다.
		map.put("아사다마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		/*
		 출력은 Iterator 패턴을 사용함
		 그런데, Set을 이용합니다.		 
		 */
		// 맵의 값을 출력하는 시나리오
		// 1. 키와 밸류를 전부 출력 entrySet()
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
	//		System.out.println("참가자 : " + e.getKey()
	//				+ ", 점수 : " + e.getValue());			
		}
		// 2. 키만 출력하는 경우
		set = map.keySet();
		// set은 toString()이 내부적으로 오버라이딩 되어있다.
		// set은 인덱스없이 입력순서에 구애받지 않는다.
		System.out.println("참가자 명단 : " + set);
		// 3. 밸류만 출력하는 경우
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0; // 이대회의 통계작성용 값
		while (it2.hasNext()) {
			Integer i = (Integer) it2.next();
			total += i.intValue(); // 각 선수들의 점수가 합계됨			
		}
		System.out.println("평균 : " + total/set.size());
		// Collection vs Collections 인터페이스이고 클래스
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최저점 : " + Collections.min(values));
	}
}
