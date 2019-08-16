package abstractEx;

public class AbstractEx {

	public static void main(String[] args) {
		
		HourWorker hw = new HourWorker("홍길동");
		hw.getInfo();
		
		WeeklyWorker ww = new WeeklyWorker("문재인");
		ww.getInfo();
		
		MonthlyWorker mw = new MonthlyWorker("강호동");
		mw.getInfo();
		
	}
	
}
