package javaBasic2.exceptionExs;

public class ExceptionEx2 {

	public static void main(String[] args) {

		int intArray[] = {1,2,0,4,5};
		
		try {
			String str = null;
			System.out.println(intArray[0]);
//			System.out.println(intArray[4]/intArray[2]);
//			System.out.println(intArray[5]);
			str.toString();
			
		// 조상 클래스가 위쪽에 올 수 없다. (unreachable error발생!)
//		}catch (Exception e){
//			// 얘기치 못한 예외
//			System.out.println("얘기치 못한 예외");
			
		// 다중 catch 예제-------------------------------------------
		/*
		 * toString(): Returns a short description of this throwable.
		 * getMessage(): Returns the detail message string of this throwable.
		 * getStackTrace(): Provides programmatic access to the stack trace information
		 * 					printed by printStackTrace().
		 * getClass(): Returns the runtime class of this Object
		 */
		}catch (ArithmeticException e){
			// 산술예외
			System.out.println(e.getClass() + ": " + e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e){
			// 배열에외
			System.out.println(e.getClass() + ": " + e.getMessage());
		}catch (NullPointerException e) {
			// null값 예외
			System.out.println(e.getClass() + ": " + e.toString());
			System.out.println(e.getClass() + ": " + e.getMessage());
			System.out.println(e.getClass() + ": " + e.getStackTrace());
			e.printStackTrace();
		}
		
		catch (Exception e){
			// 얘기치 못한 예외
			e.printStackTrace();
			System.out.println("얘기치 못한 예외");
		}
		
		finally {
			System.out.println("finally: 항상 실행되어야 할 코드");
		}
	}
}
