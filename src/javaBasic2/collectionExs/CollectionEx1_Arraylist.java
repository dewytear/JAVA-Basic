package javaBasic2.collectionExs;

import java.util.ArrayList;

public class CollectionEx1_Arraylist {
	public static void main(String[] args) {

		System.out.println("-�迭---------------");
		String[] arr = new String[3];
		arr[0] = "Apple";
		arr[1] = "Orange";
//		arr[2] = "Melon";

		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * ArrayList�� �ڵ����� �þ�⶧���� �ڿ��� ���� ���� �� �ִ�.
		 */
		System.out.println("-ArrayList----------");
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Grape");
		arrList.add("Melon");
		arrList.add("Berry");
//		arrList.add(1234);
		
		for(int i=0; i<arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//			String str = (String) arrList.get(i);
			String str = arrList.get(i);	// arrList �� Generic�� ����Ͽ� ����ȯ�� �ʿ���ԵǾ���
			System.out.println(str);
		}
	}//main()
}

