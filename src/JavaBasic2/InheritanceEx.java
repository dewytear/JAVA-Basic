package JavaBasic2;

// [region] 조상(부모) 클래스(Super class - 상위클래스)
class Human{
	String name;
	int age;
	
	// 기본생성자
	public Human() {
		this("홍길동", 22);
	}
	
	// 인자생성자
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
} // [end]

/*
 * super(변수): 부모클래스의 객체를 의미(super.변수 --> 부모클래스의 변수)
 * this : 자신의 객체를 의미(this.변수 --> 자신클래스의 변수를 접근)
 * super() 메소드: 부모클래스의 생성자를 호출하기위한 메소드
 *                 - 생성자 안에서만 호출
 *                 - 항상 생성자의 첫줄에 와야한다.
 *                 - static 메소드 안에서는 사용할 수 없다.
 *                 - 유저가 생성자를 작성하지 않은 경우에는 하위클래스의 생성자에서
 *                   자바컴파일러가 자동으로 호출한다. 
 * this() 메소드: 자신의 생성자를 호출하기위한 메소드
 */

// [region] 자손(자식) 클래스(Sub class - 하위클래스)
class Employee extends Human{
	
	int salary;
//	public Employee() {
//		// super();
//	}
	
	public Employee(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}

		/*
		 * 메소드 오버라이딩(Overriding Method): 재정의
		 * 
		 * 1) 호출하고자 하는 메소드는 부모클래스에 존재해야 한다.
		 * 2) 메소드명은 동일해야한다.
		 * 3) 매개변수와 타입이 같고 반환타입도 같다.
		 * 4) 접근제어자는 부모클래스보다 넓거나 같다.
		 * 5) 수행할 명령은 달라야한다.
		 */
		public void getInfo() {
		System.out.println("이름: " + name + "\n나이: " + age + "\n월급: " + salary);
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
} // [end]

// [region]
class Univ_Student extends Human{
	
} // [end]

// [region]
public class InheritanceEx {

	public static void main(String[] args) {

		Employee ep = new Employee("강호동", 46, 500);
		ep.getInfo();
		
//		ep.setName("문재인");
//		ep.setAge(60);
//		ep.setSalary(450);
//		ep.getInfo();

//		Univ_Student us = new Univ_Student();
	}

} // [end]
