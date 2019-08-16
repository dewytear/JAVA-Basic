package abstractEx;

public class HourWorker extends Employee{

	public HourWorker(String name) {
		super(name);
	}

	int payHour = 9700;
	int workHour = 8;
	
	public int income() {
		return payHour * workHour;
	}
	
	
}
