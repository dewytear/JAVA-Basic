package abstractEx;

//�߻�Ŭ����(Employee)�� ���� ����� ���� ����
public class MonthlyWorker extends Employee{

	public MonthlyWorker(String name) {
		super(name);
	}
	
	int payHour = 9700;
	int workHour = 8;
	int workMonth = 1;

	// �߻�Ŭ����(Employee)�� �߻�޼ҵ�(income)�� �������̵��� ���� ����
	public int income() {
		return (payHour * workHour) * (workHour * 20);
	}
}
