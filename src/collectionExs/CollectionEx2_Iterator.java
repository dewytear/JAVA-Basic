package collectionExs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* Collection framwork
 * 1. list(목록): 중복허용	순서유지(index이용)	get, Iterator
 * 2. set(집합)	: 중복X		순서무시(index없음)	Iterator
 * 3. map		: 하나의 쌍(Key, Value)으로 이루어짐
 * 
 * Iterator	= collection container의 요소에 접근할 수 있는 객체
 * - hasNext()는 Iterator 객체의 요소가 있는지 순차적 판별
 * - next()는 요소를 읽어옴
 * - remove()는 next()로 읽어온 요소를 제거
 */
public class CollectionEx2_Iterator {

	public static void main(String[] args) {

		System.out.println("-ArrayList---------");
//		Collection<String> al = new ArrayList<String>();	// Collection은 ArrayList 포함
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Third");
		System.out.println(al.get(0) + "\n");
		/*
		 * - '\n' (newline) 다음 줄 맨 처음으로 감.
		 * - '\r' (carriage return) 현재 줄 처음으로 감.
		 */
		Iterator<String> ai = al.iterator();
		while(ai.hasNext()) {
			String str = ai.next();
//			if(str == "Second")ai.remove();
			System.out.println(str);
		}

		System.out.println("-HashSet-----------");
//		Collection<String> hs = new HashSet<String>();		// Collection은 HashSet 포함
		HashSet<String> hs = new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Third");
//		System.out.println(hs.get(1));
		
		Iterator<String> hi = hs.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}
