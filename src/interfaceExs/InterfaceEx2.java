package interfaceExs;

public class InterfaceEx2 {

	public static void main(String[] args) {
		
	}

}

interface Interface1{
	void aa();
}

// interface 끼리 상속을 할 경우에는 extends 사용,
// 인터페이스는 다중 상속이 가능하다.
interface Interface2{
	void bb();
}

interface Interface3 extends Interface1, Interface2{
	void cc();
}

//class B implements Inter2{
//
//	public void aa() {}
//
//	public void bb() {}
//	
//}

class C extends Super implements Interface3{

	public void bb() {}

	public void aa() {}

	public void cc() {}
	
}

class Super{
	public void ss() {
		System.out.println("Hi~!!");
	}
}