package collectionExs;

// Ctrl+Shift+O : auto-Import
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
 * put
 * get
 */
public class CollectionEx4_map {

	public static void main(String[] args) {

		// Map Collection
		System.out.println("-Map-----------------");
		HashMap<String, String> tel = new HashMap<String, String>();
		tel.put("����", "02");
		tel.put("���", "031");
		tel.put("��õ", "032");

		System.out.println(tel.get("����"));
		System.out.println(tel.get("��õ"));
		System.out.println(tel.get("���"));
		
		// Map.Entry Ÿ��
		Set<Map.Entry<String, String>> set = tel.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		System.out.println("-Entry-while---------");
		while(it.hasNext()) {
//			Map.Entry en = (Entry) it.next();
			Map.Entry et = it.next();
			System.out.println("������ȣ: " + et.getValue() + "(" + et.getKey() + ")");
		}
		System.out.println("-Entry-foreach-------");
		for(Map.Entry<String, String> e : set) {
			System.out.println("������ȣ: " + e.getValue() + "(" + e.getKey() + ")");
		}
		
	}
}
