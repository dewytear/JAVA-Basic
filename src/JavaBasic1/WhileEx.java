
public class WhileEx {
	public static void main(String[] args) {
		int i =  1;
		
		while(i < 5) {
			System.out.println("i = " + i);
			i++;
		}	// End of while
		
		// ����loop
//		while(true) {
//			System.out.println("���ѷ���");
//		}
		
		i = 0;
		do {
			i++;
			System.out.println("i = " + i);
		}while(i < 5);
		
		// a~z���� ���
		char ch = 'a';
		do {
			System.out.println(ch);
//			ch = (char)(ch + 1);
			ch++;
		} while(ch <= 'z');
	}
}
