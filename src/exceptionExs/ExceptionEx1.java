package exceptionExs;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int intArray[] = {1,2,3,4,5};
		
		try {
			System.out.println(intArray[0]);
			System.out.println(intArray[6]);
//			System.out.println("�׻� ����Ǿ�� �� �ڵ�");
		}catch (Exception e){
			System.out.println(e.getClass() + ": " + e.getMessage());
			System.out.println("intArray �迭�� ũ��� " + intArray.length + "�Դϴ�.");
			return;
		}finally {
			System.out.println("finally: �׻� ����Ǿ�� �� �ڵ�");
			System.out.println("(return �� ������ �Ǵ��� finally�� ����ȴ�.)");
		}

	}
}
