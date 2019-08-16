package javaBasic1;
// System.in
import java.io.*;

// Scanner
import java.util.*;

// IO 입출력
public class InputOutputEx {

	// JVM에서 main 메서드를 가장 처음에 호출한다.
	public static void main(String[] args) 
	throws IOException {

			// [Region]: Output
			System.out.println(args.length);
			System.out.println();
			
//			for(int i=0;i<args.length;i++)
//			{
//				System.out.println(args[i]);
//			}
			
			// Run Configuration - arguments 에서 args 값을 셋팅함
			
			// for Each: 배열과 함께 사용할 때 유용한 반복문
			// for(변수 : 배열변수) {}
			for(String str : args) {
				System.out.println(str);
			}// [end]
			
			// [Region]: Input
			System.out.println("\n\r0~9 사이의 값을 입력하시오...");
			int n = System.in.read()-'0';	// ASCII값으로 반환한다. ('0'의 아스키값을 빼주어 숫자로 표현한다)
			// 0~9 사이의 값은: 48~57
			System.out.println(n);
			// [end]

			// [Region]: Scanner class를 사용한 입출력
			System.out.println("이름과 나이를 입력하시오...");
			Scanner sc = new Scanner(System.in);
			System.out.println("당신의 이름은 " + sc.next() + "입니다.");
			System.out.println("당신의 나이는 " + sc.next() + "살 입니다.");
			// [end]
			
			// [Region]: in class를 사용한 입출력
			System.out.println("값을 입력하시오...");
			InputStreamReader id = new InputStreamReader(System.in);
			while(true) {
				int m = id.read();
				if(m == -1) {	// ASCII 값이 -1 인 경우: Ctrl+Z
					System.out.println("break");
					break;
				}
				else System.out.println((char)m);
			}
			// [end]

			sc.close();	// Resource leak 으로 인한 반환조치
	}

}
