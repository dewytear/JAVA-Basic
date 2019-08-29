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
			
		// ���� Ŭ������ ���ʿ� �� �� ����. (unreachable error�߻�!)
//		}catch (Exception e){
//			// ���ġ ���� ����
//			System.out.println("���ġ ���� ����");
			
		// ���� catch ����-------------------------------------------
		/*
		 * toString(): Returns a short description of this throwable.
		 * getMessage(): Returns the detail message string of this throwable.
		 * getStackTrace(): Provides programmatic access to the stack trace information
		 * 					printed by printStackTrace().
		 * getClass(): Returns the runtime class of this Object
		 */
		}catch (ArithmeticException e){
			// �������
			System.out.println(e.getClass() + ": " + e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e){
			// �迭����
			System.out.println(e.getClass() + ": " + e.getMessage());
		}catch (NullPointerException e) {
			// null�� ����
			System.out.println(e.getClass() + ": " + e.toString());
			System.out.println(e.getClass() + ": " + e.getMessage());
			System.out.println(e.getClass() + ": " + e.getStackTrace());
			e.printStackTrace();
		}
		
		catch (Exception e){
			// ���ġ ���� ����
			e.printStackTrace();
			System.out.println("���ġ ���� ����");
		}
		
		finally {
			System.out.println("finally: �׻� ����Ǿ�� �� �ڵ�");
		}
	}
}
