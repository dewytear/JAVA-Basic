package javaBasic2.objectExs;
// 일반적으로 extends Object 가 생략되어 있음
public class ObjectEx1_toString{
	public static void main(String[] args) {
		ObjectEx1_toString obj = new ObjectEx1_toString();
		obj.toStringFunc(obj);
		System.out.println("-------------------------------");
		obj.toStringFunc();
	}
	
	/*
	 * toString()메소드가 자동으로 호출되는 경우
	 * System.out.println()메소드에 객체가 매개변수로 들어가는 경우
	 * 객체에 무자열 더하기 연산을 하는경우
	 */
	
	// ObjectEx1은 Object를 상속받고있음
	public void toStringFunc(ObjectEx1_toString obj) {
		System.out.println(obj);
		// obj.toString() 이 생략되어있음
		System.out.println(toString());		// Shift + F2: API문서 보기
		System.out.println("hi " + obj);
	}
	public void toStringFunc() {
		System.out.println(this);
		// obj.toString() 이 생략되어있음
		System.out.println(toString());		// Shift + F2: API문서 보기
		System.out.println("hi " + this);
	}
	
	public String aa() {
		return "하이";
	}
	
	// overridding
	// toString()은 Object를 상속받고있음
	public String toString() {
		return "ObjectEx1 클래스입니다.";
	}
}

/*
 * 실행결과
 * -------------------------------
 * 패키지    클래스 구분자 주소값(hashCode)
 * -------------------------------
 * objectExs.ObjectEx1@15db9742
 * objectExs.ObjectEx1@15db9742
 * hi objectExs.ObjectEx1@15db9742
 */