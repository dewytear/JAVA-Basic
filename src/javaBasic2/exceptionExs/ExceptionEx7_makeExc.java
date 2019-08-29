package javaBasic2.exceptionExs;

public class ExceptionEx7_makeExc {

	public static void main(String[] args) {
		Divide dv = new Divide();
		dv.setNumber(5, 0);
		
		try {
			dv.divide();
		} catch (MyException1 e) {
			/*
			 * toString(): Returns a short description of this throwable.
			 * getMessage(): Returns the detail message string of this throwable.
			 * getStackTrace(): Provides programmatic access to the stack trace information
			 * 					printed by printStackTrace().
			 * getClass(): Returns the runtime class of this Object
			 */
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class Divide {
	int n1, n2;
	
	public void setNumber(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void divide() throws MyException1 {
		if(this.n2 == 0) {
			throw new MyException1("예외 발생: 0으로 나눔");
		}else {
			System.out.println(this.n1 / this.n2);
		}
	}
}

class MyException1 extends Exception{
	public MyException1() {
		super();
	}
	
	public MyException1(String msg) {
		super(msg);
	}
}