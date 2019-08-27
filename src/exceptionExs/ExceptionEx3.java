package exceptionExs;

import java.io.IOException;

public class ExceptionEx3 {

	public static void main(String[] args) {

		/*
		 * toString(): Returns a short description of this throwable.
		 * getMessage(): Returns the detail message string of this throwable.
		 * getStackTrace(): Provides programmatic access to the stack trace information
		 * 					printed by printStackTrace().
		 * getClass(): Returns the runtime class of this Object
		 */
		
		ThrowEx thexA = new ThrowEx();
		
		try {
			thexA.throwSample(12);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}

class ThrowEx{
	public void throwSample(int n) throws IllegalArgumentException, IOException {
		// try-catch 문의 중첩되어 사용될 경우
		// throws를 사용하여 간소화 하여 사용할 수 있다.
		
//		try {
			int aa;
//			try {
				aa = System.in.read();
				System.out.println(aa);
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
			if(n > 10) {
				throw new IllegalArgumentException("n값이 10보다 크다.");
			}
//		}catch(IllegalArgumentException e) {
//			e.printStackTrace();
//		}
	}// main()
}// class