package javaBasic2.collectionExs;

import java.util.HashSet;
import java.util.Iterator;

/* Collection framwork
 * 1. list(���): �ߺ����	��������(index�̿�)	get, Iterator
 * 2. set(����)	: �ߺ�X		��������(index����)	Iterator
 * 3. map		: �ϳ��� ��(Key, Value)���� �̷����
 * 
 * Iterator	= collection container�� ��ҿ� ������ �� �ִ� ��ü
 * - hasNext()�� Iterator ��ü�� ��Ұ� �ִ��� ������ �Ǻ�
 * - next()�� ��Ҹ� �о��
 * - remove()�� next()�� �о�� ��Ҹ� ����
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
		
		// �κ�����: containsAll
		System.out.println("-�κ�����---------");
		System.out.println(hsA.containsAll(hsB));	// A.containsAll(B): B�� A�� �κ������� ��� true
		System.out.println(hsA.containsAll(hsC));
		
		// ������: addAll
		System.out.println("-������---------");
		System.out.println(hsA.addAll(hsB));		// A.addAll(B): A�� B�� ������ ������ true
		System.out.println(hsA.addAll(hsC));		// A.addAll(B): A�� B�� ������ ���н� false(�̹�����)
		
		Iterator<String> hi = hsA.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		// ������: retainAll
		System.out.println("-������---------");
		hsA.retainAll(hsB);
		Iterator<String> hi2 = hsA.iterator();
		while(hi2.hasNext()) {
			System.out.println(hi2.next());
		}
		
		// ������: removeAll
		System.out.println("-������---------");
		hsB.removeAll(hsA);
		Iterator<String> hi3 = hsA.iterator();
		while(hi3.hasNext()) {
			System.out.println(hi3.next());
		}
	}

}
