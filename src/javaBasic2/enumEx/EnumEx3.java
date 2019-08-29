package javaBasic2.enumEx;

//class LEVEL{
//	public static final LEVEL PLATINUM_MEMBER = new LEVEL();
//	public static final LEVEL ROYAL_MEMBER = new LEVEL();
//	public static final LEVEL GOLD_MEMBER = new LEVEL();
//	public static final LEVEL SILVER_MEMBER = new LEVEL();
//	private LEVEL() {}
//}

// enum Ÿ���� ������� (������ class)
enum LEVEL{
	// �������� ���α׷��� ����
//	PLATINUM_MEMBER, ROYAL_MEMBER, GOLD_MEMBER, SILVER_MEMBER;
	
	// ������ ���(���ɸ鿡���� ������ ���� ������ �߻��ϰԵǸ� �ҽ� ������ �Ұ�����)
	PLATINUM_MEMBER(10), ROYAL_MEMBER(20), GOLD_MEMBER(30), SILVER_MEMBER(40);
	
	int discount;
	
	// ������ �������̵�
//	LEVEL() {
//		System.out.println("Call constructor! " + this.toString());
//	}

	LEVEL(int discount) {
		this.discount = discount;
		System.out.println("Call constructor! " + this.toString() + " " + this.discount);
	}
	
	public String getDiscount() {
		return discount + "% ����";
	}
}

public class EnumEx3 {

	public static void main(String[] args) {
		
		LEVEL grade = LEVEL.ROYAL_MEMBER;
		
		// switch �������� long���� ������ �⺻���� enum, string(JDK7���� ����)�� ����� �� �ִ�.
		switch(grade){
		case PLATINUM_MEMBER:
			System.out.println(30+"% ����");
			break;
		case ROYAL_MEMBER:
			System.out.println(20+"% ����");
			break;
		case GOLD_MEMBER:
			System.out.println(10+"% ����");
			break;			
		case SILVER_MEMBER:
			System.out.println(5+"% ����");
			break;			
		}
		System.out.println("----------------------------------");
		
		LEVEL lv = LEVEL.GOLD_MEMBER;
		System.out.println(lv);
		String str = lv.getDiscount();
		System.out.println(str);
		System.out.println("----------------------------------");
		
		// foreach�� (enum class�� ������� ���� �ѹ��� ����)
		for(LEVEL lvl : LEVEL.values()) {
			System.out.println(lvl + "\t" + lvl.getDiscount());
		}
	}

}
