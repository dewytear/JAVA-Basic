package javaBasic2.objectExs;
// �Ϲ������� extends Object �� �����Ǿ� ����
public class ObjectEx1_toString{
	public static void main(String[] args) {
		ObjectEx1_toString obj = new ObjectEx1_toString();
		obj.toStringFunc(obj);
		System.out.println("-------------------------------");
		obj.toStringFunc();
	}
	
	/*
	 * toString()�޼ҵ尡 �ڵ����� ȣ��Ǵ� ���
	 * System.out.println()�޼ҵ忡 ��ü�� �Ű������� ���� ���
	 * ��ü�� ���ڿ� ���ϱ� ������ �ϴ°��
	 */
	
	// ObjectEx1�� Object�� ��ӹް�����
	public void toStringFunc(ObjectEx1_toString obj) {
		System.out.println(obj);
		// obj.toString() �� �����Ǿ�����
		System.out.println(toString());		// Shift + F2: API���� ����
		System.out.println("hi " + obj);
	}
	public void toStringFunc() {
		System.out.println(this);
		// obj.toString() �� �����Ǿ�����
		System.out.println(toString());		// Shift + F2: API���� ����
		System.out.println("hi " + this);
	}
	
	public String aa() {
		return "����";
	}
	
	// overridding
	// toString()�� Object�� ��ӹް�����
	public String toString() {
		return "ObjectEx1 Ŭ�����Դϴ�.";
	}
}

/*
 * ������
 * -------------------------------
 * ��Ű��    Ŭ���� ������ �ּҰ�(hashCode)
 * -------------------------------
 * objectExs.ObjectEx1@15db9742
 * objectExs.ObjectEx1@15db9742
 * hi objectExs.ObjectEx1@15db9742
 */