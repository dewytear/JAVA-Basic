package exceptionExs;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int intArray[] = {1,2,3,4,5};
		
		try {
			System.out.println(intArray[0]);
			System.out.println(intArray[6]);
//			System.out.println("항상 실행되어야 할 코드");
		}catch (Exception e){
			System.out.println(e.getClass() + ": " + e.getMessage());
			System.out.println("intArray 배열의 크기는 " + intArray.length + "입니다.");
			return;
		}finally {
			System.out.println("finally: 항상 실행되어야 할 코드");
			System.out.println("(return 을 만나게 되더라도 finally는 실행된다.)");
		}

	}
}
