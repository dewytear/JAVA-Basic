package javaBasic2.interfaceExs;

interface InterfaceA{
	void a();	// abstract public ����
}

interface InterfaceB{
	String b();	// abstract public ����
}

abstract class AbsClass{
	abstract void c();
}

// InterfaceF �� InterfaceA �� InterfaceB �� ���� ����
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

		// ������: �ϳ��� �������̽��� �������� ��ü�� ���� �� �� �ִ�.
		InterfaceEx3 if3 = new InterfaceEx3();
		if3.a();
		System.out.println(if3.b());
		if3.c();
		if3.d();
		System.out.println("------");
		
		// �θ�Ŭ����(AbsClass)�� �ڽ��������̽� ����
		AbsClass ac = new InterfaceEx3();
//		ac.a();
//		System.out.println(intF.b());
		ac.c();
//		ac.d();
		System.out.println("------");

		// �θ��������̽�(InterfaceF)�� �ڽ��������̽� ����
		InterfaceF intF = new InterfaceEx3();
		intF.a();
		System.out.println(intF.b());
//		intF.c();
		intF.d();
		
	}

}
