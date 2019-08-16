package bPack;

import aPack.*;

public class AccessChild extends AccessParent{

	// �θ� ��ӹ޾����� ��Ű���� �ٸ��� ������ public�� protected ������ �����´�.
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

	// �θ� ��� ���� �ʾұ� ������ protected ������ ������ �� ����.
	public void printMethod() {
		System.out.println("publicA: " + AccessParent.publicA);
//		System.out.println("protectedA: " + AccessParent.protectedA);
//		System.out.println("defaultA: " + defaultA);
//		System.out.println("privateA: " + privateA);
	}
}