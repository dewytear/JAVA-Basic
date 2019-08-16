package interfaceExs;

public class InterfaceEx2 {

	public static void main(String[] args) {
		
	}

}

interface Inter1{
	void aa();
}

// interface 끼리 상속을 할 경우에는 extends 사용,
// 인터페이스는 다중 상속이 가능하다.
interface Inter2 extends Inter1{
	void bb();
}

interface Inter3 extends Inter2{
	void cc();
}

class B implements Inter2{

	public void aa() {}

	public void bb() {}
	
}

class C extends Super implements Inter3{

	public void bb() {}

	public void aa() {}

	public void cc() {}
	
}

class Super{
	public void ss() {
		System.out.println("Hi~!!");
	}
}