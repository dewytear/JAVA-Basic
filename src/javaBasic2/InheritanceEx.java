package javaBasic2;

// [region] 조�??(�?�?) ?��????(Super class - ?????��????)
class Human{
	String name;
	int age;
	
	// 기본???��??
	public Human() {
		this("??길�??", 22);
	}
	
	// ?��?????��??
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("?��?: " + name);
		System.out.println("????: " + age);
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
 * super(�???): �?모�?��???��?? �?체�?? ??�?(super.�??? --> �?모�?��???��?? �???)
 * this : ?????? �?체�?? ??�?(this.�??? --> ?????��???��?? �???�? ??�?)
 * super() �?????: �?모�?��???��?? ???��??�? ?��???기�???? �?????
 *                 - ???��?? ??????�? ?��?
 *                 - ???? ???��???? 첫�??? ???��????.
 *                 - static �????? ???????? ?��?��?? ?? ????.
 *                 - ????�? ???��??�? ???��??�? ???? 경�?��???? ?????��???��?? ???��??????
 *                   ??�?컴�???��?��? ?????��? ?��?????. 
 * this() �?????: ?????? ???��??�? ?��???기�???? �?????
 */

// [region] ????(????) ?��????(Sub class - ?????��????)
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
		 * �????? ?��??��?��??(Overriding Method): ?��????
		 * 
		 * 1) ?��???�??? ???? �??????? �?모�?��???��?? 존�?��?��?? ????.
		 * 2) �?????�??? ???��?��?��????.
		 * 3) 매�?�????? ?????? �?�? �????????? �???.
		 * 4) ??근�???��???? �?모�?��???�보?? ??거�?? �???.
		 * 5) ?????? �??��?? ?��?��?��????.
		 */
		public void getInfo() {
		System.out.println("?��?: " + name + "\n????: " + age + "\n??�?: " + salary);
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

		Employee ep = new Employee("�??��??", 46, 500);
		ep.getInfo();
		
//		ep.setName("문�?��??");
//		ep.setAge(60);
//		ep.setSalary(450);
//		ep.getInfo();

//		Univ_Student us = new Univ_Student();
	}

} // [end]
