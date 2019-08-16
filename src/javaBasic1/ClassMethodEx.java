package javaBasic1;
// ?��????: ???? + 기�??
public class ClassMethodEx {
	
	static String model;
	
	// [Region] Car Class?? 멤�?
	// �??? ???��? ??�? �?기�??�? ??�? ??????경�?? 기본�??? ?��?��?
	int number;		// Default: 0
	int speed;		// Default: 0
	String color;	// Default: null
	
	public void speedUp() {
		System.out.println("????�? ?�린??");
		speed += 5;
	}

	public void speedDown() {
		System.out.println("????�? ?�린??");
		speed -= 5;
	}	// [end]
	
	public static void main(String[] args) {
		ClassMethodEx myCar = new ClassMethodEx();	// ?��???��?? �?체�?? ?????? 
		ClassMethodEx yourCar = new ClassMethodEx();// ?��???��? 참조�??? = new ?��???��?();
		
		myCar.number = 1;
		myCar.speed = 10;
		myCar.color = "Black";
		System.out.println("myCar?? number: " + myCar.number);
		System.out.println("myCar?? speed: " + myCar.speed);
		System.out.println("myCar?? color: " + myCar.color);
		myCar.speedUp();
		System.out.println("myCar?? speed: " + myCar.speed);
		System.out.println("---------------------");

		yourCar.speed = 50;
		System.out.println("yourCar?? speed: " + yourCar.speed);
		System.out.println("yourCar?? color: " + yourCar.color);
		yourCar.speedDown();
		System.out.println("yourCar?? speed: " + yourCar.speed);
		System.out.println("---------------------");
		
		// class?? ?��?��?????? ?????��??.
		CarDemo hisCar = new CarDemo();	// ?��?��?��?? hisCar ????
		CarDemo herCar = new CarDemo(); // ?��?��?��?? herCar ????
		
		// 멤�?�??????? ?��?: ?��?��?��?��?? ???��?? ???? �??��????.(참조�???�?.�?????�?)
		hisCar.power = 100;
		System.out.println("hisCar?? power: " + hisCar.power);
		hisCar.powerUp();
		hisCar.powerUp();
		System.out.println("hisCar?? power: " + hisCar.power);
		hisCar.powerDown();
		System.out.println("hisCar?? power: " + hisCar.power);
		System.out.println("---------------------");
		System.out.println("herCar?? power: " + herCar.power);
		herCar.powerUp();
		System.out.println("herCar?? power: " + herCar.power);
		System.out.println("---------------------");
		
		// ?��???��??? ?��?: ?��???��?, �???�?
		System.out.println("?��???��??? kind: " + CarDemo.kind);
		
		// ?��?��?��?? �????? ?��?: ?��?��?��?��?? ???��?? ???? ?��??? ?? ????.
		// ?��?��?��?��?(�?체�?).�???
//		System.out.println("?��?��?��?��??? engine: " + CarDemo.engine);
		System.out.println("?��?��?��?��??? engine: " + herCar.engine);
		herCar.engine = "V6";
		System.out.println("?��?��?��?��??? engine: " + herCar.engine);

		System.out.println("hisCar?? kind: " + CarDemo.kind);
		System.out.println("hisCar?? kind: " + hisCar.kind);
		System.out.println("herCar?? kind: " + herCar.kind);
		System.out.println("---------------------");
		hisCar.kind = "�???�?";
		System.out.println("hisCar?? kind: " + CarDemo.kind);
		System.out.println("hisCar?? kind: " + hisCar.kind);
		System.out.println("herCar?? kind: " + herCar.kind);
		System.out.println("---------------------");
		
		// �??? class ?��?? ?��???��????? ?��???��??? ???��?? ?? ????.
		model = "카�??�?";
		System.out.println(model);
		
		int c;	// �???�???
//		System.out.println(c);	// �???�????? �?기�??�? ??�? ???�면 ???? �???.
		c = 100;
		System.out.println("�???�??? c: " + c);
		
//		System.out.println("�???�??? aa: " + hisCar.aa);

		System.out.println("---------------------");
		// ?��???? �????? ?��?: ?��???��?.�?????�?(?��?��?��?��?? ???��?? ????�? ????.)
		hisCar.kind();
		System.out.println("---------------------");
		
		hisCar.changeKind();
		System.out.println("hisCar?? kind: " + hisCar.kind);
		System.out.println("herCar?? kind: " + herCar.kind);
	}
}

// ?? ???? ?????? public class?? ????�? 존�?��?��?��????.
// public ?????? �?�??? ?��???��?? ?��??? ???��??��? ????.
// main() �?????�? �?�??? ?��???��?? public ?????? ???��???.
class CarDemo{
	// �???(variable)
	// 1) ?��???��???: static �??? �???(static �???, 공�??�???)
	// 2) 멤�?�???(?��?��?��?? �???: instance variable) : static?? �?�? ???? �???(non-static)
	// - ?��????��? ?��???��????? ?��?��?��?��???�? 멤�? �????��? ????.
	//   �?, ?��???? ?????? ???��?? �???�? 멤�? �????��? ????.
	//
	// 3) �???�???(local �???): �??????? �??? ???? ???��?? �???
	//                           �??????? �????? ?????? ??�? ??�??? ?��????.
	
	
	// 멤�?�????? �?기�??�? ??�? ???? 경�?? default �??? ?��?��???.
	// ex> int default �??��? 0, String?? null�??? ?��?��???.
	// �???�????? �?! �?기�??�? ?��?��????.
	
	static String kind = "????�?";	// ?��???��???
	int power;
	String engine;
	
	// [Region] ???��??: ?��?��?��??(�?�?)�? ???��???? ?��?
	//			 - ???��?? ?��??? ?��?? ?��???��?�? ????
	//			 - �??????? �??��???? �????????? ???��?? ????.
	//			 - 멤�?�???�? �?기�?? ?? ?? ?��?��????.
	public CarDemo() {
		kind = "????�?";
		int aa = 200;	// �???�??? aa?? ?? ???��?? ??????�? ???��????.
	}
	// [end]
	
	// [Region] ?��???? �?????: static ???��??�? �??? ???? �?????
	//			- ?��???? �???�? ?��?��?? ?? ????.
	public static void kind() {
		System.out.println("????�? ??????.");
		System.out.println(kind + " ??????.");
//		System.out.println(power);
	}// [end]
	
	// [Region] 멤�? �?????
	public void changeKind() {
		kind = "????�?";	// 멤�? �????? ???????? ?��???? �??? ?��?? �???
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
