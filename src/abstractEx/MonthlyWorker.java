package abstractEx;

public class MonthlyWorker extends Employee{

	public MonthlyWorker(String name) {
		super(name);
	}
	
	int payHour = 9700;
	int workHour = 8;
	int workMonth = 1;
	
	public int income() {
		return (payHour * workHour) * (workHour * 20);
	}
}
