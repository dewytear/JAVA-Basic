// 패키지 선언문은 제일 첫문장에 와야한다.
package javaBasic2.myPackage2;

import javaBasic2.myPackage.Demo2;

public class PackageTest {

	public static void main(String[] args) {
		
		javaBasic2.myPackage.Demo1 d1 = new javaBasic2.myPackage.Demo1();
		d1.MethodDemo1();
		
		Demo2 d2 = new Demo2();
		d2.MethodDemo2();
		
	}

}
