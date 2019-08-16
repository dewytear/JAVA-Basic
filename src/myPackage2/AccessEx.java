package myPackage2;

import myPackage.*;

public class AccessEx {

	public static void main(String[] args) {
		
		Demo2 dm2 = new Demo2();
		dm2.MethodDemo2();
		
		/*
		 * // 패키지가 다르기 때문에 default형인 Demo3는 불러올 수 없다.
		 * Demo3 dm3 = new Demo3();
		 * dm3.MethodDemo3();
		 */
	}

}
