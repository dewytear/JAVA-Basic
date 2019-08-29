package javaBasic2.interfaceExs;

public class InterfaceEx1 {

	public static void main(String[] args) {
		
	}

}

interface Inter1{
	//abstract public void aa();
	void aa();
}

interface Inter2{
	void bb();
}

class MyClass implements Inter1, Inter2{

	// 추상메소드 구현
	public void aa() {
	}

	// 추상메소드 구현
	public void bb() {
	}
	
}