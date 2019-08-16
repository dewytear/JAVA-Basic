package bPack;

import aPack.*;

public class AccessChild extends AccessParent{

	// 부모를 상속받았으나 패키지가 다르기 때문에 public과 protected 변수만 가져온다.
	public void printMethod() {
		System.out.println("publicA: " + publicA);
		System.out.println("protectedA: " + protectedA);
//		System.out.println("defaultA: " + defaultA);
//		System.out.println("privateA: " + privateA);
	}
	
	public static void main(String[] args) {
		AccessChild ac = new AccessChild();
		ac.printMethod();
	}
}

class AccessChild2 {

	// 부모를 상속 받지 않았기 때문에 protected 변수는 가져올 수 없다.
	public void printMethod() {
		System.out.println("publicA: " + AccessParent.publicA);
//		System.out.println("protectedA: " + AccessParent.protectedA);
//		System.out.println("defaultA: " + defaultA);
//		System.out.println("privateA: " + privateA);
	}
}