package enumEx;

// A회사 등급
interface GRADE_A{
	// public static final 이 생략되어있음
	int PLATINUM_MEMBER = 1, ROYAL_MEMBER = 2, GOLD_MEMBER = 3, SILVER_MEMBER = 4;
}
//class GRADE_A{
//	public static final GRADE_A PLATINUM_MEMBER = new GRADE_A();
//	public static final GRADE_A ROYAL_MEMBER = new GRADE_A();
//	public static final GRADE_A GOLD_MEMBER = new GRADE_A();
//	public static final GRADE_A SILVER_MEMBER = new GRADE_A();
//}

// B회사 등급
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
	/*	회원등급
		1. PLATINUM_MEMBER	
		2. ROYAL_MEMBER	
		3. GOLD_MEMBER
		4. SILVER_MEMBER
	*/		
	
	public static void main(String[] args) {
		if(GRADE_A.PLATINUM_MEMBER == GRADE_B.PLATINUM_MEMBER){
			System.out.println("A회사와 B회사의 할인율은 같다.");
		}
		
		int grade = GRADE_A.GOLD_MEMBER;
		
		// switch 문에서는 long형을 제외한 기본형과 enum, string(JDK7부터 지원)을 사용할 수 있다.
		switch(grade){
		case GRADE_A.PLATINUM_MEMBER:
			System.out.println(30+"% 할인");
			break;
		case GRADE_A.ROYAL_MEMBER:
			System.out.println(20+"% 할인");
			break;
		case GRADE_A.GOLD_MEMBER:
			System.out.println(10+"% 할인");
			break;			
		case GRADE_A.SILVER_MEMBER:
			System.out.println(5+"% 할인");
			break;			
		}
	}

}
