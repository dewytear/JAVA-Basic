package javaBasic2.collectionExs;

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
 * 
 * containsAll
 * addAll
 * retainAll
 * removeAll
 */
public class CollectionEx3_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> hsA = new HashSet<String>();
		hsA.add("a");
		hsA.add("b");
		hsA.add("c");

		HashSet<String> hsB = new HashSet<String>();
		hsB.add("c");
		hsB.add("d");
		hsB.add("e");

		HashSet<String> hsC = new HashSet<String>();
		hsC.add("a");
		hsC.add("b");
		
		// 부분집합: containsAll
		System.out.println("-부분집합---------");
		System.out.println(hsA.containsAll(hsB));	// A.containsAll(B): B가 A의 부분집합인 경우 true
		System.out.println(hsA.containsAll(hsC));
		
		// 합집합: addAll
		System.out.println("-합집합---------");
		System.out.println(hsA.addAll(hsB));		// A.addAll(B): A와 B의 합집합 성공시 true
		System.out.println(hsA.addAll(hsC));		// A.addAll(B): A와 B의 합집합 실패시 false(이미포함)
		
		Iterator<String> hi = hsA.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		// 교집합: retainAll
		System.out.println("-교집합---------");
		hsA.retainAll(hsB);
		Iterator<String> hi2 = hsA.iterator();
		while(hi2.hasNext()) {
			System.out.println(hi2.next());
		}
		
		// 차집합: removeAll
		System.out.println("-차집합---------");
		hsB.removeAll(hsA);
		Iterator<String> hi3 = hsA.iterator();
		while(hi3.hasNext()) {
			System.out.println(hi3.next());
		}
	}

}
