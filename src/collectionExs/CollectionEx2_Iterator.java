package collectionExs;

import java.util.ArrayList;
import java.util.Collection;
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
 */
public class CollectionEx2_Iterator {

	public static void main(String[] args) {

		System.out.println("-ArrayList---------");
//		Collection<String> al = new ArrayList<String>();	// Collection�� ArrayList ����
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Third");
		System.out.println(al.get(0) + "\n");
		/*
		 * - '\n' (newline) ���� �� �� ó������ ��.
		 * - '\r' (carriage return) ���� �� ó������ ��.
		 */
		Iterator<String> ai = al.iterator();
		while(ai.hasNext()) {
			String str = ai.next();
//			if(str == "Second")ai.remove();
			System.out.println(str);
		}

		System.out.println("-HashSet-----------");
//		Collection<String> hs = new HashSet<String>();		// Collection�� HashSet ����
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
