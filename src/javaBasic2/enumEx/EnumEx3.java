package javaBasic2.enumEx;

//class LEVEL{
//	public static final LEVEL PLATINUM_MEMBER = new LEVEL();
//	public static final LEVEL ROYAL_MEMBER = new LEVEL();
//	public static final LEVEL GOLD_MEMBER = new LEVEL();
//	public static final LEVEL SILVER_MEMBER = new LEVEL();
//	private LEVEL() {}
//}

// enum 타입의 상수지정 (일종의 class)
enum LEVEL{
	// 동적으로 프로그래밍 가능
//	PLATINUM_MEMBER, ROYAL_MEMBER, GOLD_MEMBER, SILVER_MEMBER;
	
	// 고정값 사용(성능면에서는 좋으나 값의 변경이 발생하게되면 소스 수정이 불가피함)
	PLATINUM_MEMBER(10), ROYAL_MEMBER(20), GOLD_MEMBER(30), SILVER_MEMBER(40);
	
	int discount;
	
	// 생성자 오버라이딩
//	LEVEL() {
//		System.out.println("Call constructor! " + this.toString());
//	}

	LEVEL(int discount) {
		this.discount = discount;
		System.out.println("Call constructor! " + this.toString() + " " + this.discount);
	}
	
	public String getDiscount() {
		return discount + "% 할인";
	}
}

public class EnumEx3 {

	public static void main(String[] args) {
		
		LEVEL grade = LEVEL.ROYAL_MEMBER;
		
		// switch 문에서는 long형을 제외한 기본형과 enum, string(JDK7부터 지원)을 사용할 수 있다.
		switch(grade){
		case PLATINUM_MEMBER:
			System.out.println(30+"% 할인");
			break;
		case ROYAL_MEMBER:
			System.out.println(20+"% 할인");
			break;
		case GOLD_MEMBER:
			System.out.println(10+"% 할인");
			break;			
		case SILVER_MEMBER:
			System.out.println(5+"% 할인");
			break;			
		}
		System.out.println("----------------------------------");
		
		LEVEL lv = LEVEL.GOLD_MEMBER;
		System.out.println(lv);
		String str = lv.getDiscount();
		System.out.println(str);
		System.out.println("----------------------------------");
		
		// foreach문 (enum class의 상수들을 각각 한번씩 저장)
		for(LEVEL lvl : LEVEL.values()) {
			System.out.println(lvl + "\t" + lvl.getDiscount());
		}
	}

}
