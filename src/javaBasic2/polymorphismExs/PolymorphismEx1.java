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
		
		// 부모타입으로 자식의 인스턴스 생성
		Super sc = new Child();
		System.out.println(sc.a + sc.b);
//		System.out.println(sc.x + sc.y);
		sc.ss();	// Overriding 된 것이 우선적으로 접근된다.
		
		// 자식타입으로 부모의 인스턴스 생성을 할 수 없다.
		// - 자식타입에는 멤버변수가 더 많을 수 있기때문에..
//		Child cs = new Super();
		
	}
}

class Super{
	int a=100;
	int b=200;
	
	public void ss() {
		System.out.println("부모클래스");
	}
}

class Child extends Super{
	int x=1000;
	int y=2000;
	
	public void ss() {
		System.out.println("자식클래스");
	}
}