// ��Ű�� ������ ���� ù���忡 �;��Ѵ�.
package MyPackage2;

// ��Ű�� ������ import ���� �´�.
// Ctrl + Shift + 'O': ����Ű�� �ڵ� import �� �� �ִ�.
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
