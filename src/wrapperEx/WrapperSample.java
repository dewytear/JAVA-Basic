package wrapperEx;
/*
 * wrapper class
 * - 기본형을 참조형으로 만들어 놓은것(class로 정의한 것)
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
		// wrapper class는 equals()를 Overridding했다.
		System.out.println(aa.toString());
		// wrapper class는 toString()를 Overridding했다.
		System.out.println("bb.toString(): " + bb);
		
		String str = "97";
		int i = Integer.parseInt(str);
		System.out.println(i);
		int j = i + 100;
		System.out.println(j);
		
		String str2 = Integer.toBinaryString(97);
		System.out.println("이진수: " + str2);
		int k = Integer.parseInt(str2, 2);	// 2진수 str2를 10진수 값으로 변환
		System.out.println(k);
		int l = Integer.parseInt("100", 8);
		System.out.println(l);				// 8진수 100의 10진수 값은 64
		Integer intg = new Integer(150);
		int m = intg.intValue();			// Integer 객체를 기본형(int)으로 바꿔줌
		int o = 200;			
		int n = m + o;
		System.out.println(n);
		
		// JDK 1.5 이상부터 autoBoxing 기능을 제공
		int p = intg + o;		// unAutoBoxing: wrapper 객체를 자동으로 기본형으로 바꾸어줌
		Integer ing = 200;		// autoBoxing: Integer ing = new Integer(200);
		System.out.println(p);
		System.out.println(ing);
	}
}
