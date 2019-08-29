package javaBasic2.polymorphismExs;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		Super sp = new Super();
		System.out.println(sp.a + sp.b);
		sp.ss();
		
		Child ch = new Child();
		System.out.println(ch.x + ch.y);
		System.out.println(ch.a + ch.b);
		ch.ss();
		
		// �θ�Ÿ������ �ڽ��� �ν��Ͻ� ����
		Super sc = new Child();
		System.out.println(sc.a + sc.b);
//		System.out.println(sc.x + sc.y);
		sc.ss();	// Overriding �� ���� �켱������ ���ٵȴ�.
		
		// �ڽ�Ÿ������ �θ��� �ν��Ͻ� ������ �� �� ����.
		// - �ڽ�Ÿ�Կ��� ��������� �� ���� �� �ֱ⶧����..
//		Child cs = new Super();
		
	}
}

class Super{
	int a=100;
	int b=200;
	
	public void ss() {
		System.out.println("�θ�Ŭ����");
	}
}

class Child extends Super{
	int x=1000;
	int y=2000;
	
	public void ss() {
		System.out.println("�ڽ�Ŭ����");
	}
}