package collectionExs;

// Ctrl+Shift+O : auto-Import
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* Collection framwork
 * 1. list(목록): 중복허용	순서유지(index이용)	get, Iterator
 * 2. set(집합)	: 중복X		순서무시(index없음)	Iterator
 * 3. map		: 하나의 쌍(Key, Value)으로 이루어짐
 * 
 * Iterator	= collection container의 요소에 접근할 수 있는 객체
 * - hasNext()는 Iterator 객체의 요소가 있는지 순차적 판별
 * - next()는 요소를 읽어옴
 * - remove()는 next()로 읽어온 요소를 제거
 * 
 * put
 * get
 */
public class CollectionEx4_map {

	public static void main(String[] args) {

		// Map Collection
		System.out.println("-Map-----------------");
		HashMap<String, String> tel = new HashMap<String, String>();
		tel.put("서울", "02");
		tel.put("경기", "031");
		tel.put("인천", "032");

		System.out.println(tel.get("서울"));
		System.out.println(tel.get("인천"));
		System.out.println(tel.get("경기"));
		
		// Map.Entry 타입
		Set<Map.Entry<String, String>> set = tel.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		System.out.println("-Entry-while---------");
		while(it.hasNext()) {
//			Map.Entry en = (Entry) it.next();
			Map.Entry et = it.next();
			System.out.println("지역번호: " + et.getValue() + "(" + et.getKey() + ")");
		}
		System.out.println("-Entry-foreach-------");
		for(Map.Entry<String, String> e : set) {
			System.out.println("지역번호: " + e.getValue() + "(" + e.getKey() + ")");
		}
		
	}
}
