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

// final Ŭ������ ��� ������ ������, �ڽ��� ��ӹ����� �ִ�.
final class Sub extends Super{
	public void method() {
		System.out.println("Sub Class");
	}
	
	// Super Ŭ������ �ִ� final �޼ҵ�� �������̵� �� �� ����.
//	public void method2() {
//		System.out.println("final TEST2");
//	}
}

//class SubSub extends Sub{
//	
//}