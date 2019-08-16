package abstractEx;

// 추상클래스: 상속을 강요하게된다.
//             (final 지정자와 반대의 성격을 갖는다.)
// 추상메소드가 있을 경우 꼭! 추상 클래스가 되어야한다.
// 추상메소드가 없더라도 추상클래스가 될 수 있다.
abstract public class Employee {
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	// 추상메소드: 오버라이딩을 강요하게된다.
	abstract public int income();
	
	public void getInfo() {
		System.out.println("Name: " + name + "\nIncome: " + income());
	}
}
