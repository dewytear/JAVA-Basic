package abstractEx;

// �߻�Ŭ����: ����� �����ϰԵȴ�.
//             (final �����ڿ� �ݴ��� ������ ���´�.)
// �߻�޼ҵ尡 ���� ��� ��! �߻� Ŭ������ �Ǿ���Ѵ�.
// �߻�޼ҵ尡 ������ �߻�Ŭ������ �� �� �ִ�.
abstract public class Employee {
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	// �߻�޼ҵ�: �������̵��� �����ϰԵȴ�.
	abstract public int income();
	
	public void getInfo() {
		System.out.println("Name: " + name + "\nIncome: " + income());
	}
}
