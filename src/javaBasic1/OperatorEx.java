package javaBasic1;
public class OperatorEx {
	public static void main(String[] args)
	{
		System.out.println("### ���α׷��� ���� ###");
		
		System.out.println("\r\n1.���������");
		
		int a = 100;
		System.out.println(a/5);
		System.out.println(a%7);

		System.out.println("\\n\\r2.��Ʈ������");
		
		int b = 3; 
		int c = 5;
		// b: 0011, c: 0101
		System.out.println("b And c = " + (b&c));	// 0001
		System.out.println("b OR c = " + (b|c));	// 0111
		System.out.println("b XOR c = " + (b^c));	// 0110

		System.out.println("\r\n3.����Ʈ������");
		/*
		 * >>, <<, >>>(JAVA���� �ִ� ������) 
		 * 1) >> :	���������� �־��� ��Ʈ����ŭ �̵��϶�.
		 * 			�տ� ����ִ� ��ĭ�� ��ȣ��Ʈ�� ä���.
		 * 2) << :	�������� �־��� ��Ʈ����ŭ �̵��϶�.
		 * 			�ڿ� ����ִ� ��ĭ�� 0���� ä���.
		 * 3) >>>(JAVA���� �ִ� ������) :	���������� �־��� ��Ʈ����ŭ �̵��϶�.
		 * 			�տ� ����ִ� ��ĭ�� 0���� ä���.
		 */
		System.out.println("-6 >> 2 = " + (-6 >> 2));	// 6: 00000110, -6: 11111010
														// -6>>2: 11111110
		System.out.println("-6 >>> 2 = " + (-6 >>> 2));	// 32��Ʈ�� ���Ǿ���
		System.out.println("-6 << 2 = " + (-6 << 2));

		System.out.println("\r\n4.�񱳿�����");
		
		int m = 1000, n = 100;
		if(m > n)
			System.out.println("m�� n���� Ů�ϴ�.");
		else
			System.out.println("m�� n���� �۰ų� �����ϴ�.");
		
		if(m != n)
			System.out.println("m�� n���� �����ʴ�.");
		else
			System.out.println("m�� n���� ����.");

		System.out.println("\r\n5.���ǿ�����");
		// &&, ||

		System.out.println("\r\n6.���׿�����");
		// ���� = (����)? ��1 : ��2;'
		int result = (m > n)? m : n;
		System.out.println("result = " + result);
		String str = (m > n)? "m�� n���� ŭ" : "m�� n���� �۰ų� ����";
		System.out.println("str = " + str);

		System.out.println("\r\n7.���Կ�����");
		m += 10;	// m = m + 10 ���� ���� �ӵ��� ������.
		System.out.println(m);
		int ii = 10;
		ii += 10;
		int jj = 10;
		jj -= 3;
		System.out.println("ii = " + ii);
		System.out.println("jj = " + jj);
		jj *= 2;
		System.out.println("jj = " + jj);
		int x = 5;
		x <<= 2;		// 0000 0101 -> 0010 0100 = 16 + 4 = 20
		System.out.println("x = " + x);
		int y = 3;
		y ^= 2;			// XOR ���� ���δٸ� ��Ʈ�� ��� ���� 1
		System.out.println("y = " + y);	// 0011 ^ 0010 = 0001
		
		System.out.println("\r\n8.���׿�����");
		int xx = 10, yy = 20;
		System.out.println(+xx);
		System.out.println(-xx);
		xx++;
		yy--;
		System.out.println("xx = " + xx);
		System.out.println("yy = " + yy);
		int qq = ++xx;	// xx�� ���� ������Ű�� qq�� ������ �Ѵ�.
		System.out.println("qq = " + qq);
		int vv =xx ++;	// vv�� �������ϰ� vv�� ���� �����Ѵ�.
		System.out.println("vv = " + vv);
		
		// ��Ʈ�� not ������ : ~ 1111 1111 1111 1111 1111 1111 1111 0011 = 0000 0000 0000 0000 0000 0000 0000 1100 = 8 + 4 = 12
		int gg = 0xfffffff3;
		System.out.println("~gg = " + ~gg);
		
		// ������ ������ : !
		boolean bool = true;
		System.out.println("!bool = " + !bool);
		System.out.println(!(200<100));
		
		System.out.println("\r\n### ���α׷��� �� ###");
	}
}
