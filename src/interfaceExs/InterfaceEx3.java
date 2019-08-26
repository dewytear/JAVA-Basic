package interfaceExs;

interface InterfaceA{
	void a();	// abstract public 생략
}

interface InterfaceB{
	String b();	// abstract public 생략
}

abstract class AbsClass{
	abstract void c();
}

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

		InterfaceEx3 if3 = new InterfaceEx3();
		if3.a();
		System.out.println(if3.b());
		if3.c();
		if3.d();
		System.out.println("------");
		
		AbsClass ac = new InterfaceEx3();
//		ac.a();
//		System.out.println(intF.b());
		ac.c();
//		ac.d();
		System.out.println("------");
		
		InterfaceF intF = new InterfaceEx3();
		intF.a();
		System.out.println(intF.b());
//		intF.c();
		intF.d();
		
	}

}
