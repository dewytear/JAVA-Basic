package polymorphismExs;

public class PolymorphismEx4 {

	static int i = 0;
	static Calculator calcArray[] = new Calculator[6];
	
	public static void exe(Calculator cal) {
		calcArray[i++] = cal;
		cal.setNum(100, 200);
		cal.calcResult();
	}

	public static void exeSequence() {
		try {
			for(i = 0; i < calcArray.length; i++) {
				if(calcArray[i].operand() == null) break;
				String str = calcArray[i].operand();
				System.out.println("�������(" + i + "): " + str);
			}
		}catch(NullPointerException e) {
//		}catch(Exception e) {
			// ����ó�� 
			System.out.println(e.getClass() + ": " + e.getMessage());
		}finally {
			System.out.println("End");
		}
	}
	
	public static void main(String[] args) {
		
		// ������: �ϳ��� Ÿ��(Calculator)���� ���� �ٸ� ���(Sum, Subtractor)�� ����
		Calculator c1 = new Sum();	// �θ� Ÿ���� �ڽ� �ν��Ͻ��� ����
		Calculator c2 = new Subtractor();
		
		exe(c1);
		exe(c2);

		System.out.println("-----------------");
		System.out.println("-     array     -");
		System.out.println("-----------------");
		// �迭�� �̿��Ͽ� ������ ����
		Calculator cns[] = new Calculator[2];
		cns[0] = new Sum();
		cns[1] = new Subtractor();
		
		exe(cns[0]);
		exe(cns[1]);

		System.out.println("-----------------");
		System.out.println("-    Sequence   -");
		System.out.println("-----------------");
		// �迭�� �̿��Ͽ� ���� ���� ǥ��
		exeSequence();
		
//		Sum sum = new Sum();
//		sum.setNum(100, 200);
//		sum.calcResult();
//		
//		Subtractor sub = new Subtractor();
//		sub.setNum(100, 200);
//		sub.calcResult();
	}

}

// �߻�Ŭ����: ����� ������
abstract class Calculator{
	int n1, n2;
	
	public void setNum(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public abstract void calcResult();
	public abstract String operand();
}

class Sum extends Calculator{
	public void calcResult() {
		System.out.println("+ ���: " + (this.n1+this.n2));
	}
	public String operand() {
		return "����";
	}
}

class Subtractor extends Calculator{
	public void calcResult() {
		System.out.println("- ���: " + (this.n1-this.n2));
	}
	public String operand() {
		return "����";
	}
}