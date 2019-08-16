package abstractEx;

// 추상클래스(Employee)로 부터 상속을 강요 받음
public class HourWorker extends Employee{

	public HourWorker(String name) {
		super(name);
	}

	int payHour = 9700;
	int workHour = 8;
	
	// 추상클래스(Employee)의 추상메소드(income)의 오버라이딩을 강요 받음
	public int income() {
		return payHour * workHour;
	}
	
	
}
