package javaBasic2.interfaceExs;

public class InterfaceAuser {

	public static void main(String[] args) {
		A a = new A();
		a.setNumber(40, 10, 30);
		System.out.println("�հ�: " + a.sum());
		System.out.println("���: " + a.avg());
	}

}

// A Ŭ������ ����
interface Ainterface{
	void setNumber(int n1, int n2, int n3);	// abstract public ����
	int sum();
	int avg();
}

class A implements Ainterface{
	int n1,	n2, n3;
	
	public void setNumber(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public int sum() {
		return n1+n2+n3;
	}
	
	public int avg() {
		return (n1+n2+n3) / 3;
	}
}