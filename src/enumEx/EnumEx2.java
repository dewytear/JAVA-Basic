package enumEx;

// Aȸ�� ���
interface GRADE_A{
	// public static final �� �����Ǿ�����
	int PLATINUM_MEMBER = 1, ROYAL_MEMBER = 2, GOLD_MEMBER = 3, SILVER_MEMBER = 4;
}
//class GRADE_A{
//	public static final GRADE_A PLATINUM_MEMBER = new GRADE_A();
//	public static final GRADE_A ROYAL_MEMBER = new GRADE_A();
//	public static final GRADE_A GOLD_MEMBER = new GRADE_A();
//	public static final GRADE_A SILVER_MEMBER = new GRADE_A();
//}

// Bȸ�� ���
interface GRADE_B{
	int PLATINUM_MEMBER = 1, ROYAL_MEMBER = 2, GOLD_MEMBER = 3, SILVER_MEMBER = 4;
}
//class GRADE_B{
//	public static final GRADE_B PLATINUM_MEMBER = new GRADE_B();
//	public static final GRADE_B ROYAL_MEMBER = new GRADE_B();
//	public static final GRADE_B GOLD_MEMBER = new GRADE_B();
//	public static final GRADE_B SILVER_MEMBER = new GRADE_B();
//}

public class EnumEx2 {
	
//	public static final int PLATINUM_MEMBER = 1;
//	public static final int ROYAL_MEMBER = 2;
//	public static final int GOLD_MEMBER = 3;
//	public static final int SILVER_MEMBER = 4;
	/*	ȸ�����
		1. PLATINUM_MEMBER	
		2. ROYAL_MEMBER	
		3. GOLD_MEMBER
		4. SILVER_MEMBER
	*/		
	
	public static void main(String[] args) {
		if(GRADE_A.PLATINUM_MEMBER == GRADE_B.PLATINUM_MEMBER){
			System.out.println("Aȸ��� Bȸ���� �������� ����.");
		}
		
		int grade = GRADE_A.GOLD_MEMBER;
		
		// switch �������� long���� ������ �⺻���� enum, string(JDK7���� ����)�� ����� �� �ִ�.
		switch(grade){
		case GRADE_A.PLATINUM_MEMBER:
			System.out.println(30+"% ����");
			break;
		case GRADE_A.ROYAL_MEMBER:
			System.out.println(20+"% ����");
			break;
		case GRADE_A.GOLD_MEMBER:
			System.out.println(10+"% ����");
			break;			
		case GRADE_A.SILVER_MEMBER:
			System.out.println(5+"% ����");
			break;			
		}
	}

}
