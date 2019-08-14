public class DataTypeEx
{
	public static void main(String[] args)
	{
		System.out.println("### 프로그램의 시작 ###");

		System.out.println("\r\n*** 기본형 ***");
		System.out.println("\r\n1.정수형");
		byte bt = 10;						// -128~127, 변수의 초기화
		byte bt2 = 127;
		System.out.println("bt = " + bt);
		System.out.println("bt2 = " + bt2);
		
		short st = 1000;
		System.out.println("st = " + st);	// -32,768~32,767
		
		int i = 1000000;
		System.out.println("i = " + i);		// -2147483628 ~ 2147483627
		
		// JAVA에서는 정수형의 기본형이 integer
		// (정수값은 모조건 integer형으로 인식한다.)
		long ln = 1000000000;
		long ln2 = 30000000000L;			// integer의 범위를 벗어난다
		long ln1 = 1200l;					// 소문자 l, 대문자 L 점미사로 사용한다.
		System.out.println("ln = " + ln);
		
		System.out.println("\r\n2.실수형");
		// 실수형 : float형, double형
		// float : 소수점 이하 7자리까지 표현가능
		// double : 소수점 이하 15~16... 표현가능
		// JAVA에서는 실수는 무조건 double 형으로 인식한다.
		
		float ft = 2.456F;					// double의 범위를 벗어난다
		float ft1 = 2.45678912F;			// 소문자 f, 대문자 F 점미사로 사용한다.
		float ft2 = 333;					// 정수는 무조건 integer 로 인식되어
											// float형보다 작은그릇이므로 인식됨.
		
		// byte < short < integer < long < float < double
		// char
		
		System.out.println("ft = " + ft);
		
		double db = 12.1111;
		double db2 = 0.2333E3;				// 0.2333*10^3 = 0.2333 * 1000
		double db3 = 2333333333333.0000012;	// 0.233333333333300000012E12
		System.out.println("db = " + db);
		System.out.println("db2 = " + db2);
		System.out.println("db3 = " + db3);

		System.out.println("\r\n3.문자형");
		// C언어에서는 1byte(ASCII코드), JAVA에서는 유니코드체계를 사용
		
		char ch = '가';						// char : 0~65535, 2byte
		char ch2 = 'a';						// 'a' = '\u0061'
		char ch3 = '\u0041';				// '\u0041' = 'A', 16진수 0~9,A B C D E F
											// 4*16^1 + 1*16^0 = 65
		System.out.println("ch = " + ch);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println(ch3+1);			// 65 + 1 = 66

		System.out.println("\r\n4.논리형");
		
		boolean bool = true;				// 앞글자는 대문자 True(X) False(X)
		System.out.println("bool = " + bool);	// 0, 1 로 참거짓을 표현할 수 없다.
		
		// 하나의 문자('ㅁ')는 작은따옴표, 문자열은 큰따옴표를 사용하여 표시한다.
		// + 연산자 원리 : 문자열 + 데이타타입 --> 문자열, 테이타타입 + 문자열 --> 문자열

		System.out.println("\r\n*** 참조형 ***");
		
		String str1 = new String("사랑합니다.. 여러분!!");
		String str2 = "반갑습니다.. 여러분!!";	// 기본형이 아니라 참조형이다!
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		System.out.println("\r\n### 프로그램의 끝 ###");
	}
}