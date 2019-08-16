// 패키지 선언문은 제일 첫문장에 와야한다.
package MyPackage2;

// 패키지 다음에 import 문이 온다.
// Ctrl + Shift + 'O': 단축키로 자동 import 할 수 있다.
//import MyPackage.Demo1;
import MyPackage.Demo2;

public class PackageTest {

	public static void main(String[] args) {
		
		MyPackage.Demo1 d1 = new MyPackage.Demo1();
		d1.MethodDemo1();
		
		Demo2 d2 = new Demo2();
		d2.MethodDemo2();
		
	}

}
