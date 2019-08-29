package javaBasic2.interfaceExs;

interface InterfaceA{
	void a();	// abstract public 생략
}

interface InterfaceB{
	String b();	// abstract public 생략
}

abstract class AbsClass{
	abstract void c();
}

// InterfaceF 는 InterfaceA 와 InterfaceB 에 접근 가능
interface InterfaceF extends InterfaceA, InterfaceB{
	void d();
}

public class InterfaceEx3 extends AbsClass implements InterfaceF {
	
	public void a() {
		System.out.println("AAA");
	}
	
	public String b() {
		return "BBB";
	}

	public void c() {
		System.out.println("CCC");
	}

	public void d() {
		System.out.println("DDD");
	}
	
	public static void main(String[] args) {

		// 다형성: 하나의 인터페이스로 여러개의 객체에 접근 할 수 있다.
		InterfaceEx3 if3 = new InterfaceEx3();
		if3.a();
		System.out.println(if3.b());
		if3.c();
		if3.d();
		System.out.println("------");
		
		// 부모클래스(AbsClass)로 자식인터페이스 생성
		AbsClass ac = new InterfaceEx3();
//		ac.a();
//		System.out.println(intF.b());
		ac.c();
//		ac.d();
		System.out.println("------");

		// 부모인터페이스(InterfaceF)로 자식인터페이스 생성
		InterfaceF intF = new InterfaceEx3();
		intF.a();
		System.out.println(intF.b());
//		intF.c();
		intF.d();
		
	}

}
