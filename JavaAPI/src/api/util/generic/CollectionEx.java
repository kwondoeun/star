package api.util.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionEx {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		//add로 추가, get으로 얻기
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		list.add(1); //추가
		list.addAll(list2); //통째로 집어넣어줌(한번에 추가)
		
		System.out.println(list);
		
		int a = list.get(0); //1
		
		int s = list.size(); //4
		
		list.forEach(x -> {
			System.out.println(x); //람다식 : 내부 요소를 회전 시켜주는 
		});
		
		for(int y : list) {
			System.out.println(y); //위의 람다식과 결과는 동일
		}
		
		/////////////////////////////////////////////
		
		Map<Integer, String> map = new HashMap<>(); //키와 값의 타입
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		map.put(3, "haha"); //값의 추가와 삭제를 put으로, 조회는 get
		
		System.out.println(map.toString());
		
		String result2 = map.get(1); //1번 key에 대한 값이 출력
		
		//맵의 반복
		Set<Entry<Integer, String>> ens = map.entrySet();
		
		for(Entry<Integer, String> e : ens) {
			//System.out.println(e);
			System.out.println(e.getKey()); //key만 출력
			System.out.println(e.getValue()); //value만 출력
		}

	}

}
