// 클래스: 속성 + 기능
public class ClassMethodEx {
	
	static String model;
	
	// [Region] Car Class의 멤버
	// 변수 선언만 하고 초기화를 하지 않았을경우 기본값이 들어감
	int number;		// Default: 0
	int speed;		// Default: 0
	String color;	// Default: null
	
	public void speedUp() {
		System.out.println("속도를 올린다");
		speed += 5;
	}

	public void speedDown() {
		System.out.println("속도를 내린다");
		speed -= 5;
	}	// [end]
	
	public static void main(String[] args) {
		ClassMethodEx myCar = new ClassMethodEx();	// 클래스를 객체화 할때는 
		ClassMethodEx yourCar = new ClassMethodEx();// 클래스명 참조변수 = new 클래스명();
		
		myCar.number = 1;
		myCar.speed = 10;
		myCar.color = "Black";
		System.out.println("myCar의 number: " + myCar.number);
		System.out.println("myCar의 speed: " + myCar.speed);
		System.out.println("myCar의 color: " + myCar.color);
		myCar.speedUp();
		System.out.println("myCar의 speed: " + myCar.speed);
		System.out.println("---------------------");

		yourCar.speed = 50;
		System.out.println("yourCar의 speed: " + yourCar.speed);
		System.out.println("yourCar의 color: " + yourCar.color);
		yourCar.speedDown();
		System.out.println("yourCar의 speed: " + yourCar.speed);
		System.out.println("---------------------");
		
		// class는 사용자정의 타입이다.
		CarDemo hisCar = new CarDemo();	// 인스턴스 hisCar 생성
		CarDemo herCar = new CarDemo(); // 인스턴스 herCar 생성
		
		// 멤버메소드의 호출: 인스턴스를 생성한 후에 가능하다.(참조변수명.메소드명)
		hisCar.power = 100;
		System.out.println("hisCar의 power: " + hisCar.power);
		hisCar.powerUp();
		hisCar.powerUp();
		System.out.println("hisCar의 power: " + hisCar.power);
		hisCar.powerDown();
		System.out.println("hisCar의 power: " + hisCar.power);
		System.out.println("---------------------");
		System.out.println("herCar의 power: " + herCar.power);
		herCar.powerUp();
		System.out.println("herCar의 power: " + herCar.power);
		System.out.println("---------------------");
		
		// 클래스변수 호출: 클래스명, 변수명
		System.out.println("클래스변수 kind: " + CarDemo.kind);
		
		// 인스턴스 변수의 호출: 인스턴스를 생성한 후에 호출할 수 있다.
		// 인스턴스명(객체명).변수
//		System.out.println("인스턴스변수 engine: " + CarDemo.engine);
		System.out.println("인스턴스변수 engine: " + herCar.engine);
		herCar.engine = "V6";
		System.out.println("인스턴스변수 engine: " + herCar.engine);

		System.out.println("hisCar의 kind: " + CarDemo.kind);
		System.out.println("hisCar의 kind: " + hisCar.kind);
		System.out.println("herCar의 kind: " + herCar.kind);
		System.out.println("---------------------");
		hisCar.kind = "중형차";
		System.out.println("hisCar의 kind: " + CarDemo.kind);
		System.out.println("hisCar의 kind: " + hisCar.kind);
		System.out.println("herCar의 kind: " + herCar.kind);
		System.out.println("---------------------");
		
		// 같은 class 내의 클래스변수는 클래스명을 생략할 수 있다.
		model = "카니발";
		System.out.println(model);
		
		int c;	// 지역변수
//		System.out.println(c);	// 지역변수는 초기화를 하지 않으면 에러 발생.
		c = 100;
		System.out.println("지역변수 c: " + c);
		
//		System.out.println("지역변수 aa: " + hisCar.aa);

		System.out.println("---------------------");
		// 클래스 메소드 호출: 클래스명.메소드명(인스턴스를 생성할 필요가 없다.)
		hisCar.kind();
		System.out.println("---------------------");
		
		hisCar.changeKind();
		System.out.println("hisCar의 kind: " + hisCar.kind);
		System.out.println("herCar의 kind: " + herCar.kind);
	}
}

// 한 파일 안에는 public class는 하나만 존재해야한다.
// public 타입을 가지는 클래스의 이름을 파일명으로 한다.
// main() 메소드를 가지는 클래스에 public 타입을 정해준다.
class CarDemo{
	// 변수(variable)
	// 1) 클래스변수: static 붙은 변수(static 변수, 공유변수)
	// 2) 멤버변수(인스턴스 변수: instance variable) : static이 붙지 않은 변수(non-static)
	// - 일반적으로 클래스변수와 인스턴스변수를 멤버 변수라고 한다.
	//   즉, 클래스 영역에 선언한 변수를 멤버 변수라고 한다.
	//
	// 3) 지역변수(local 변수): 메서드의 블럭 안에 선언된 변수
	//                           메서드의 블럭이 끝나는 순간 생명을 다한다.
	
	
	// 멤버변수는 초기화를 하지 않을 경우 default 값이 들어간다.
	// ex> int default 값으로 0, String은 null값이 들어간다.
	// 지역변수는 꼭! 초기화를 해야한다.
	
	static String kind = "소형차";	// 클래스변수
	int power;
	String engine;
	
	// [Region] 생성자: 인스턴스(객체)를 생성할때 호출
	//			 - 생성자 이름은 해당 클래스명과 동일
	//			 - 메소드와 비슷하나 반환타입이 없어야 한다.
	//			 - 멤버변수를 초기화 할 때 사용한다.
	public CarDemo() {
		kind = "소형차";
		int aa = 200;	// 지역변수 aa는 이 생성자 안에서만 유효하다.
	}
	// [end]
	
	// [Region] 클래스 메소드: static 제어자가 붙어 있는 메소드
	//			- 클래스 변수만 사용할 수 있다.
	public static void kind() {
		System.out.println("소형차 입니다.");
		System.out.println(kind + " 입니다.");
//		System.out.println(power);
	}// [end]
	
	// [Region] 멤버 메소드
	public void changeKind() {
		kind = "대형차";	// 멤버 메소드 안에서는 클래스 변수 사용 가능
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
