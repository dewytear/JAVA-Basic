package javaBasic2.objectExs;

public class EqualsEx {
	public static void main(String[] args) {
		
		int i = 100;
		int j = 100;
		String str1 = new String("ABC");	// String str1 = "ABC"와 같다.
		String str2 = "ABC";
		String str3 = "XYZ";
		
		/*
		 * 비교연산자(==)는 기본자료형을 비교하는 경우에는 값을 비교하지만,
		 * 참조형(Reference Type)의 비교는 주소값을 비교한다.
		 */
		
		if(i == j) {
			System.out.println("i = j");
		}else {
			System.out.println("i <> j");
		}
		System.out.println("------------");
		
		/*
		 * Equals()가 Object 클래스에 있는 경우는 주소값을 비교한다.
		 * String 객체의 Equals()는 오버라이딩 된 메소드여서 내용을 비교한다.
		 * 
		 * String 객체의 hashCode()는 오버라이딩 된 메소드여서
		 * 내용이 같으면 주소가 같게 나온다. 
		 * Object 클래스에 있는 경우는 내용이 같아도 다른 주소값이 나온다.
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
		
		str1 = str2;	// str1에 str2의 주소값을 넣어줌
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
	
	// 오버라이딩하여 값을 비교하게 사용 
//	public boolean equals(Object obj) {
//		if(obj != null && obj instanceof Value) {
//			return a == ((Value)obj).a;
//		}else {
//			return false;
//		}
//	}
}