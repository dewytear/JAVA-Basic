package javaBasic2;

public class Student {
	private String name;
	private int id;
	private int age;
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "트럼프";
		System.out.println(stu.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public int getAge() {
		return this.age;
	}
	
	public void showInfo() {
		System.out.println("------- Info STudent -----");
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("학번: " + this.getId());
	}
}
