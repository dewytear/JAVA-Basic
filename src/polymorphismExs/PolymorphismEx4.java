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
				System.out.println("연산순서(" + i + "): " + str);
			}
		}catch(NullPointerException e) {
//		}catch(Exception e) {
			// 에외처리 
			System.out.println(e.getClass() + ": " + e.getMessage());
		}finally {
			System.out.println("End");
		}
	}
	
	public static void main(String[] args) {
		
		// 다형성: 하나의 타입(Calculator)으로 서로 다른 기능(Sum, Subtractor)을 구현
		Calculator c1 = new Sum();	// 부모 타입의 자식 인스턴스를 생성
		Calculator c2 = new Subtractor();
		
		exe(c1);
		exe(c2);

		System.out.println("-----------------");
		System.out.println("-     array     -");
		System.out.println("-----------------");
		// 배열을 이용하여 다형성 구현
		Calculator cns[] = new Calculator[2];
		cns[0] = new Sum();
		cns[1] = new Subtractor();
		
		exe(cns[0]);
		exe(cns[1]);

		System.out.println("-----------------");
		System.out.println("-    Sequence   -");
		System.out.println("-----------------");
		// 배열을 이용하여 실행 순서 표현
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

// 추상클래스: 상속을 강요함
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
		System.out.println("+ 결과: " + (this.n1+this.n2));
	}
	public String operand() {
		return "덧셈";
	}
}

class Subtractor extends Calculator{
	public void calcResult() {
		System.out.println("- 결과: " + (this.n1-this.n2));
	}
	public String operand() {
		return "뺄셈";
	}
}