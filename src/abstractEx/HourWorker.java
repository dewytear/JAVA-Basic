package abstractEx;

// �߻�Ŭ����(Employee)�� ���� ����� ���� ����
public class HourWorker extends Employee{

	public HourWorker(String name) {
		super(name);
	}

	int payHour = 9700;
	int workHour = 8;
	
	// �߻�Ŭ����(Employee)�� �߻�޼ҵ�(income)�� �������̵��� ���� ����
	public int income() {
		return payHour * workHour;
	}
	
	
}
