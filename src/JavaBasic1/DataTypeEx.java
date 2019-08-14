package JavaBasic1;
public class DataTypeEx
{
	public static void main(String[] args)
	{
		System.out.println("### ���α׷��� ���� ###");

		System.out.println("\r\n*** �⺻�� ***");
		System.out.println("\r\n1.������");
		byte bt = 10;						// -128~127, ������ �ʱ�ȭ
		byte bt2 = 127;
		System.out.println("bt = " + bt);
		System.out.println("bt2 = " + bt2);
		
		short st = 1000;
		System.out.println("st = " + st);	// -32,768~32,767
		
		int i = 1000000;
		System.out.println("i = " + i);		// -2147483628 ~ 2147483627
		
		// JAVA������ �������� �⺻���� integer
		// (�������� ������ integer������ �ν��Ѵ�.)
		long ln = 1000000000;
		long ln2 = 30000000000L;			// integer�� ������ �����
		long ln1 = 1200l;					// �ҹ��� l, �빮�� L ���̻�� ����Ѵ�.
		System.out.println("ln = " + ln);
		
		System.out.println("\r\n2.�Ǽ���");
		// �Ǽ��� : float��, double��
		// float : �Ҽ��� ���� 7�ڸ����� ǥ������
		// double : �Ҽ��� ���� 15~16... ǥ������
		// JAVA������ �Ǽ��� ������ double ������ �ν��Ѵ�.
		
		float ft = 2.456F;					// double�� ������ �����
		float ft1 = 2.45678912F;			// �ҹ��� f, �빮�� F ���̻�� ����Ѵ�.
		float ft2 = 333;					// ������ ������ integer �� �νĵǾ�
											// float������ �����׸��̹Ƿ� �νĵ�.
		
		// byte < short < integer < long < float < double
		// char
		
		System.out.println("ft = " + ft);
		
		double db = 12.1111;
		double db2 = 0.2333E3;				// 0.2333*10^3 = 0.2333 * 1000
		double db3 = 2333333333333.0000012;	// 0.233333333333300000012E12
		System.out.println("db = " + db);
		System.out.println("db2 = " + db2);
		System.out.println("db3 = " + db3);

		System.out.println("\r\n3.������");
		// C������ 1byte(ASCII�ڵ�), JAVA������ �����ڵ�ü�踦 ���
		
		char ch = 'A';						// char : 0~65535, 2byte
		char ch2 = 'a';						// 'a' = '\u0061'
		char ch3 = '\u0041';				// '\u0041' = 'A', 16���� 0~9,A B C D E F
											// 4*16^1 + 1*16^0 = 65
		System.out.println("ch = " + ch);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println(ch3+1);			// 65 + 1 = 66

		System.out.println("\r\n4.����");
		
		boolean bool = true;				// �ձ��ڴ� �빮�� True(X) False(X)
		System.out.println("bool = " + bool);	// 0, 1 �� �������� ǥ���� �� ����.
		
		// �ϳ��� ����('��')�� ��������ǥ, ���ڿ��� ū����ǥ�� ����Ͽ� ǥ���Ѵ�.
		// + ������ ���� : ���ڿ� + ����ŸŸ�� --> ���ڿ�, ����ŸŸ�� + ���ڿ� --> ���ڿ�

		System.out.println("\r\n*** ������ ***");
		
		String str1 = new String("����մϴ�.. ������!!");
		String str2 = "�ݰ����ϴ�.. ������!!";	// �⺻���� �ƴ϶� �������̴�!
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		System.out.println("\r\n### ���α׷��� �� ###");
	}
}