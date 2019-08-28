package enumEx;

public class EnumEx1 {
	
/*	회원등급
  	1. PLATINUM_MEMBER	
	2. ROYAL_MEMBER	
	3. GOLD_MEMBER
	4. SILVER_MEMBER
*/		

	public static void main(String[] args) {
		int grade = 3;
		switch(grade){
		case 1:
			System.out.println(30+"% 할인");
			break;
		case 2:
			System.out.println(20+"% 할인");
			break;
		case 3:
			System.out.println(10+"% 할인");
			break;			
		case 4:
			System.out.println(5+"% 할인");
			break;			
		}
	}

}
