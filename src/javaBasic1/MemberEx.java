package JavaBasic1;
public class MemberEx {
	// 클래스의 구성요소: 속성(필드) + 메서드(생성자)
	
	static int aa;	// static 변수
	String str;		// intance 변수
	
	// 성성자: static이 붙지 않는다.
	// 생성자 부분은 생략이 되었을 경우 자바 컴파일러에서 기본생성자를 자동 생성한다.
	// 생성자 부분이 있을경우 자동 생성하지 않는다.
	// 기본생성자: public MemberEx() {}
	
	public MemberEx() {
		System.out.println("Constructor");
	}
	
	// 클래스 메소드
	public static void classMethod() {
		System.out.println("Class Method");
	}
	
	public static String returnClassMethod() {
		System.out.println("Return Class Method");
		return "반환값";
	}
	
	// 인스탄스 메소드
	public void instanceMethod() {
		System.out.println("Instance Method");
	}

	public int returnInstanceMethod() {
		System.out.println("Return Instance Method");
		return 1000;
	}
	
	// 매개변수가 있는 메소드
	public void parameterMethod(String str1) {
		System.out.println(str1);
	}

	public String returnParameterMethod(String str1) {
		return "\nRetuen Value: " + str1; 
	}
	
	public static void main(String[] args) {
		// 생성자를 호출: 객체를 생성한다는 의미
		MemberEx me = new MemberEx();

		classMethod();							// 클래스 메소드
		me.instanceMethod();					// 인스탄스 메소드
		me.parameterMethod("Parameter Method");	// 매개변수 메소드
		
		String str2 = returnClassMethod();
		System.out.println("Retuen Value: " + str2);
		
		int i = me.returnInstanceMethod();
		System.out.println("Retuen Value: " + i);
		
		System.out.println("Return Parameter Method" + me.returnParameterMethod("내이름"));
	}
}
