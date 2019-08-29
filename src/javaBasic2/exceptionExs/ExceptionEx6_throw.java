package javaBasic2.exceptionExs;

import java.io.IOException;

public class ExceptionEx6_throw {

	public static void main(String[] args) {
		
		MyException mye = new MyException();
		
		try {
			mye.IOExc();
		} catch (IOException e) {
			/*
			 * toString(): Returns a short description of this throwable.
			 * getMessage(): Returns the detail message string of this throwable.
			 * getStackTrace(): Provides programmatic access to the stack trace information
			 * 					printed by printStackTrace().
			 * getClass(): Returns the runtime class of this Object
			 */
			e.printStackTrace();
		}
		
		mye.IOExe();

		mye.ArithmeticExc();
	}
}

class MyException{
	
	// UnChecked Exception: Runtime exception
	void ArithmeticExc() {
		throw new ArithmeticException();
	}

	// Checked Exception
	void IOExc() throws IOException {
		throw new IOException();
	}
	
	void IOExe() {
		try {
			throw new IOException();
		} catch(IOException e) {
			/*
			 * toString(): Returns a short description of this throwable.
			 * getMessage(): Returns the detail message string of this throwable.
			 * getStackTrace(): Provides programmatic access to the stack trace information
			 * 					printed by printStackTrace().
			 * getClass(): Returns the runtime class of this Object
			 */
			e.printStackTrace();
		}
	}
}