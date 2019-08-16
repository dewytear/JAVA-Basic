package abstractEx;

public class WeeklyWorker extends Employee{

	public WeeklyWorker(String name) {
		super(name);
	}
	
	int payHour = 9700;
	int workHour = 8;
	int workWeek = 2;
	
	public int income() {
		return (payHour * workHour) * (workWeek * 5);
	}
}
