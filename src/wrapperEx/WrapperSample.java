package wrapperEx;
/*
 * wrapper class
 * - �⺻���� ���������� ����� ������(class�� ������ ��)
 * 
	parseInt(String s) 
	Parses the string argument as a signed decimal integer.
	parseInt(String s,int radix) 
	Parses the string argument as a signed integer in the radixspecified by the second argument.

	toBinaryString(int i) 
	Returns a string representation of the integer argument as anunsigned integer in base 2.
	
	toHexString(int i) 
	Returns a string representation of the integer argument as anunsigned integer in base 16.
 */
public class WrapperSample {

	public static void main(String[] args) {
		
		Integer aa = new Integer(100);
		Integer bb = new Integer(100);

		System.out.println("aa.equals(bb): " + aa.equals(bb));
		// wrapper class�� equals()�� Overridding�ߴ�.
		System.out.println(aa.toString());
		// wrapper class�� toString()�� Overridding�ߴ�.
		System.out.println("bb.toString(): " + bb);
		
		String str = "97";
		int i = Integer.parseInt(str);
		System.out.println(i);
		int j = i + 100;
		System.out.println(j);
		
		String str2 = Integer.toBinaryString(97);
		System.out.println("������: " + str2);
		int k = Integer.parseInt(str2, 2);	// 2���� str2�� 10���� ������ ��ȯ
		System.out.println(k);
		int l = Integer.parseInt("100", 8);
		System.out.println(l);				// 8���� 100�� 10���� ���� 64
		Integer intg = new Integer(150);
		int m = intg.intValue();			// Integer ��ü�� �⺻��(int)���� �ٲ���
		int o = 200;			
		int n = m + o;
		System.out.println(n);
		
		// JDK 1.5 �̻���� autoBoxing ����� ����
		int p = intg + o;		// unAutoBoxing: wrapper ��ü�� �ڵ����� �⺻������ �ٲپ���
		Integer ing = 200;		// autoBoxing: Integer ing = new Integer(200);
		System.out.println(p);
		System.out.println(ing);
	}
}
