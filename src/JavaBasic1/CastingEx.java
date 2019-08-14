
public class CastingEx {

	public static void main(String[] args)
	{
		System.out.println("### 프로그램의 시작 ###");
		
		System.out.println("\r\n*** 형변환 ***");
		
		int _ic = 65;
		char _ci = 'A';
		float _fi = 1.6f;
		int _if = 10;
		System.out.println("_i = " + (char)_ic);
		System.out.println("_c = " + (int)_ci);
		System.out.println("_f = " + (int)_fi);
		System.out.println("_f = " + (float)_if);

		byte bt = 10;
		long ln = bt;		// 자동형변환
		int i = (int)ln;	// 강제형변환(Casting)
		System.out.println("ln = " + ln);
		System.out.println("i = " + i);
		
		char ch = 'A';
		System.out.println("ch = " + ch + 1);
		System.out.println(ch + 1);				// 일종의 정수형으로 자동형변환
		
		char ch2 = 'C';
		int result = ch2 + 3;
		System.out.println("ch2 = " + ch2);
		System.out.println("result = " + result);
		
		char ch3 = (char)result;
		System.out.println("ch3 = " + ch3);
		
		System.out.println("\r\n### 프로그램의 끝 ###");
		
	}
}
