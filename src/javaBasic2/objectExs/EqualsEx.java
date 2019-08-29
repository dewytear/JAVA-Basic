package javaBasic2.objectExs;

public class EqualsEx {
	public static void main(String[] args) {
		
		int i = 100;
		int j = 100;
		String str1 = new String("ABC");	// String str1 = "ABC"�� ����.
		String str2 = "ABC";
		String str3 = "XYZ";
		
		/*
		 * �񱳿�����(==)�� �⺻�ڷ����� ���ϴ� ��쿡�� ���� ��������,
		 * ������(Reference Type)�� �񱳴� �ּҰ��� ���Ѵ�.
		 */
		
		if(i == j) {
			System.out.println("i = j");
		}else {
			System.out.println("i <> j");
		}
		System.out.println("------------");
		
		/*
		 * Equals()�� Object Ŭ������ �ִ� ���� �ּҰ��� ���Ѵ�.
		 * String ��ü�� Equals()�� �������̵� �� �޼ҵ忩�� ������ ���Ѵ�.
		 * 
		 * String ��ü�� hashCode()�� �������̵� �� �޼ҵ忩��
		 * ������ ������ �ּҰ� ���� ���´�. 
		 * Object Ŭ������ �ִ� ���� ������ ���Ƶ� �ٸ� �ּҰ��� ���´�.
		 */
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		if(str1.equals(str2)) { 
			System.out.println("str1 = str2");
		}else {
			System.out.println("str1 <> str2");
		}
		
		if(str1 == str2) {
			System.out.println("str1 = str2");
		}else {
			System.out.println("str1 <> str2");
		}
		
		str1 = str2;	// str1�� str2�� �ּҰ��� �־���
		if(str1 == str2) {
			System.out.println("str1 = str2");
		}else {
			System.out.println("str1 <> str2");
		}
		System.out.println("------------");
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());

		if(v1.equals(v2)) {
			System.out.println("v1 = v2");
		}else {
			System.out.println("v1 <> v2");
		}
		
		v1 = v2;
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		if(v1.equals(v2)) {
			System.out.println("v1 = v2");
		}else {
			System.out.println("v1 <> v2");
		}
	}
}

class Value{
	int a;
	public Value(int a) {
		this.a = a;	
	}
	
	// �������̵��Ͽ� ���� ���ϰ� ��� 
//	public boolean equals(Object obj) {
//		if(obj != null && obj instanceof Value) {
//			return a == ((Value)obj).a;
//		}else {
//			return false;
//		}
//	}
}