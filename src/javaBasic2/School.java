package javaBasic2;

public class School {

	public static void main(String[] args) {
		Student std = new Student();
		std.setName("Gil-Dong Hong");
		std.setAge(18);
		std.setId(20191234);
		/*
		 * System.out.println("이름: " + this.getName());
		 * System.out.println("나이: " + this.getAge());
		 * System.out.println("학번: " + this.getId());
		 */
		std.showInfo();
	}
	
}
