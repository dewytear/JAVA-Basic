package javaBasic1;
public class OperatorEx {
	public static void main(String[] args)
	{
		System.out.println("### 프로그램의 시작 ###");
		
		System.out.println("\r\n1.산술연산자");
		
		int a = 100;
		System.out.println(a/5);
		System.out.println(a%7);

		System.out.println("\\n\\r2.비트연산자");
		
		int b = 3; 
		int c = 5;
		// b: 0011, c: 0101
		System.out.println("b And c = " + (b&c));	// 0001
		System.out.println("b OR c = " + (b|c));	// 0111
		System.out.println("b XOR c = " + (b^c));	// 0110

		System.out.println("\r\n3.쉬프트연산자");
		/*
		 * >>, <<, >>>(JAVA에만 있는 연산자) 
		 * 1) >> :	오른쪽으로 주어진 비트수만큼 이동하라.
		 * 			앞에 비어있는 빈칸은 부호비트로 채운다.
		 * 2) << :	왼쪽으로 주어진 비트수만큼 이동하라.
		 * 			뒤에 비어있는 빈칸은 0으로 채운다.
		 * 3) >>>(JAVA에만 있는 연산자) :	오른쪽으로 주어진 비트수만큼 이동하라.
		 * 			앞에 비어있는 빈칸은 0으로 채운다.
		 */
		System.out.println("-6 >> 2 = " + (-6 >> 2));	// 6: 00000110, -6: 11111010
														// -6>>2: 11111110
		System.out.println("-6 >>> 2 = " + (-6 >>> 2));	// 32비트로 계산되었음
		System.out.println("-6 << 2 = " + (-6 << 2));

		System.out.println("\r\n4.비교연산자");
		
		int m = 1000, n = 100;
		if(m > n)
			System.out.println("m은 n보다 큽니다.");
		else
			System.out.println("m은 n보다 작거나 같습니다.");
		
		if(m != n)
			System.out.println("m은 n보다 같지않다.");
		else
			System.out.println("m은 n보다 같다.");

		System.out.println("\r\n5.조건연산자");
		// &&, ||

		System.out.println("\r\n6.삼항연산자");
		// 변수 = (조건)? 값1 : 값2;'
		int result = (m > n)? m : n;
		System.out.println("result = " + result);
		String str = (m > n)? "m은 n보다 큼" : "m은 n보다 작거나 같다";
		System.out.println("str = " + str);

		System.out.println("\r\n7.대입연산자");
		m += 10;	// m = m + 10 보다 연산 속도가 빠르다.
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
		y ^= 2;			// XOR 연산 서로다른 비트인 경우 값이 1
		System.out.println("y = " + y);	// 0011 ^ 0010 = 0001
		
		System.out.println("\r\n8.단항연산자");
		int xx = 10, yy = 20;
		System.out.println(+xx);
		System.out.println(-xx);
		xx++;
		yy--;
		System.out.println("xx = " + xx);
		System.out.println("yy = " + yy);
		int qq = ++xx;	// xx의 값을 증가시키고 qq에 대입을 한다.
		System.out.println("qq = " + qq);
		int vv =xx ++;	// vv에 대입을하고 vv의 값을 증가한다.
		System.out.println("vv = " + vv);
		
		// 비트별 not 연산자 : ~ 1111 1111 1111 1111 1111 1111 1111 0011 = 0000 0000 0000 0000 0000 0000 0000 1100 = 8 + 4 = 12
		int gg = 0xfffffff3;
		System.out.println("~gg = " + ~gg);
		
		// 논리부정 연산자 : !
		boolean bool = true;
		System.out.println("!bool = " + !bool);
		System.out.println(!(200<100));
		
		System.out.println("\r\n### 프로그램의 끝 ###");
	}
}
