package javaBasic2.abstractEx;

public class FinalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Super{
	public void method() {
		System.out.println("Super Class");
	}
	
	final public void method2() {
		System.out.println("final TEST");
	}
}

// final 클래스를 상속 받을수 없지만, 자신은 상속받을수 있다.
final class Sub extends Super{
	public void method() {
		System.out.println("Sub Class");
	}
	
	// Super 클래스에 있는 final 메소드는 오버라이딩 할 수 없다.
//	public void method2() {
//		System.out.println("final TEST2");
//	}
}

//class SubSub extends Sub{
//	
//}