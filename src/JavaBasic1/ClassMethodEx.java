// Ŭ����: �Ӽ� + ���
public class ClassMethodEx {
	
	static String model;
	
	// [Region] Car Class�� ���
	// ���� ���� �ϰ� �ʱ�ȭ�� ���� �ʾ������ �⺻���� ��
	int number;		// Default: 0
	int speed;		// Default: 0
	String color;	// Default: null
	
	public void speedUp() {
		System.out.println("�ӵ��� �ø���");
		speed += 5;
	}

	public void speedDown() {
		System.out.println("�ӵ��� ������");
		speed -= 5;
	}	// [end]
	
	public static void main(String[] args) {
		ClassMethodEx myCar = new ClassMethodEx();	// Ŭ������ ��üȭ �Ҷ��� 
		ClassMethodEx yourCar = new ClassMethodEx();// Ŭ������ �������� = new Ŭ������();
		
		myCar.number = 1;
		myCar.speed = 10;
		myCar.color = "Black";
		System.out.println("myCar�� number: " + myCar.number);
		System.out.println("myCar�� speed: " + myCar.speed);
		System.out.println("myCar�� color: " + myCar.color);
		myCar.speedUp();
		System.out.println("myCar�� speed: " + myCar.speed);
		System.out.println("---------------------");

		yourCar.speed = 50;
		System.out.println("yourCar�� speed: " + yourCar.speed);
		System.out.println("yourCar�� color: " + yourCar.color);
		yourCar.speedDown();
		System.out.println("yourCar�� speed: " + yourCar.speed);
		System.out.println("---------------------");
		
		// class�� ��������� Ÿ���̴�.
		CarDemo hisCar = new CarDemo();	// �ν��Ͻ� hisCar ����
		CarDemo herCar = new CarDemo(); // �ν��Ͻ� herCar ����
		
		// ����޼ҵ��� ȣ��: �ν��Ͻ��� ������ �Ŀ� �����ϴ�.(����������.�޼ҵ��)
		hisCar.power = 100;
		System.out.println("hisCar�� power: " + hisCar.power);
		hisCar.powerUp();
		hisCar.powerUp();
		System.out.println("hisCar�� power: " + hisCar.power);
		hisCar.powerDown();
		System.out.println("hisCar�� power: " + hisCar.power);
		System.out.println("---------------------");
		System.out.println("herCar�� power: " + herCar.power);
		herCar.powerUp();
		System.out.println("herCar�� power: " + herCar.power);
		System.out.println("---------------------");
		
		// Ŭ�������� ȣ��: Ŭ������, ������
		System.out.println("Ŭ�������� kind: " + CarDemo.kind);
		
		// �ν��Ͻ� ������ ȣ��: �ν��Ͻ��� ������ �Ŀ� ȣ���� �� �ִ�.
		// �ν��Ͻ���(��ü��).����
//		System.out.println("�ν��Ͻ����� engine: " + CarDemo.engine);
		System.out.println("�ν��Ͻ����� engine: " + herCar.engine);
		herCar.engine = "V6";
		System.out.println("�ν��Ͻ����� engine: " + herCar.engine);

		System.out.println("hisCar�� kind: " + CarDemo.kind);
		System.out.println("hisCar�� kind: " + hisCar.kind);
		System.out.println("herCar�� kind: " + herCar.kind);
		System.out.println("---------------------");
		hisCar.kind = "������";
		System.out.println("hisCar�� kind: " + CarDemo.kind);
		System.out.println("hisCar�� kind: " + hisCar.kind);
		System.out.println("herCar�� kind: " + herCar.kind);
		System.out.println("---------------------");
		
		// ���� class ���� Ŭ���������� Ŭ�������� ������ �� �ִ�.
		model = "ī�Ϲ�";
		System.out.println(model);
		
		int c;	// ��������
//		System.out.println(c);	// ���������� �ʱ�ȭ�� ���� ������ ���� �߻�.
		c = 100;
		System.out.println("�������� c: " + c);
		
//		System.out.println("�������� aa: " + hisCar.aa);

		System.out.println("---------------------");
		// Ŭ���� �޼ҵ� ȣ��: Ŭ������.�޼ҵ��(�ν��Ͻ��� ������ �ʿ䰡 ����.)
		hisCar.kind();
		System.out.println("---------------------");
		
		hisCar.changeKind();
		System.out.println("hisCar�� kind: " + hisCar.kind);
		System.out.println("herCar�� kind: " + herCar.kind);
	}
}

// �� ���� �ȿ��� public class�� �ϳ��� �����ؾ��Ѵ�.
// public Ÿ���� ������ Ŭ������ �̸��� ���ϸ����� �Ѵ�.
// main() �޼ҵ带 ������ Ŭ������ public Ÿ���� �����ش�.
class CarDemo{
	// ����(variable)
	// 1) Ŭ��������: static ���� ����(static ����, ��������)
	// 2) �������(�ν��Ͻ� ����: instance variable) : static�� ���� ���� ����(non-static)
	// - �Ϲ������� Ŭ���������� �ν��Ͻ������� ��� ������� �Ѵ�.
	//   ��, Ŭ���� ������ ������ ������ ��� ������� �Ѵ�.
	//
	// 3) ��������(local ����): �޼����� �� �ȿ� ����� ����
	//                           �޼����� ���� ������ ���� ������ ���Ѵ�.
	
	
	// ��������� �ʱ�ȭ�� ���� ���� ��� default ���� ����.
	// ex> int default ������ 0, String�� null���� ����.
	// ���������� ��! �ʱ�ȭ�� �ؾ��Ѵ�.
	
	static String kind = "������";	// Ŭ��������
	int power;
	String engine;
	
	// [Region] ������: �ν��Ͻ�(��ü)�� �����Ҷ� ȣ��
	//			 - ������ �̸��� �ش� Ŭ������� ����
	//			 - �޼ҵ�� ����ϳ� ��ȯŸ���� ����� �Ѵ�.
	//			 - ��������� �ʱ�ȭ �� �� ����Ѵ�.
	public CarDemo() {
		kind = "������";
		int aa = 200;	// �������� aa�� �� ������ �ȿ����� ��ȿ�ϴ�.
	}
	// [end]
	
	// [Region] Ŭ���� �޼ҵ�: static �����ڰ� �پ� �ִ� �޼ҵ�
	//			- Ŭ���� ������ ����� �� �ִ�.
	public static void kind() {
		System.out.println("������ �Դϴ�.");
		System.out.println(kind + " �Դϴ�.");
//		System.out.println(power);
	}// [end]
	
	// [Region] ��� �޼ҵ�
	public void changeKind() {
		kind = "������";	// ��� �޼ҵ� �ȿ����� Ŭ���� ���� ��� ����
	}
	
	public void powerUp() {
		System.out.println("Power UP!");
		power += 10;
	}

	public void powerDown() {
		System.out.println("Power DOWN!");
		power -= 10;
	}// [end]
}
