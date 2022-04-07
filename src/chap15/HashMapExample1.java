package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("신용권", 95);
		System.out.println("총 Entry 수 : "+map.size());
		
		System.out.println("\t홍길동 : " +map.get("홍길동"));
		System.out.println("\t신용권 : " +map.get("신용권"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIt = keySet.iterator();
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			int value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println(map.get("홍길동"));
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = es.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : "+ value);
		}	
		System.out.println();
		
		map.clear();
		System.out.println("size : "+ map.size());
		
		
	}
}





























