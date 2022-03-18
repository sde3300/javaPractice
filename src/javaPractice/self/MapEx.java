package javaPractice.self;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball","야구");

		System.out.println(map.get("people")); //값 가져오기
		System.out.println(map.containsKey("baseball")); //해당키가 있는지 확인
		System.out.println(map.size()); //Map의 갯수
		System.out.println(map.keySet()); //Map의 모든 Key를 모아서 리턴
		//KeySet() 메소드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴한다
		
	}


}
