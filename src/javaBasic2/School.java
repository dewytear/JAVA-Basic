package javaBasic2;

public class School {

	public static void main(String[] args) {
		Student std = new Student();
		std.setName("Gil-Dong Hong");
		std.setAge(18);
		std.setId(20191234);
		/*
		 * System.out.println("�̸�: " + this.getName());
		 * System.out.println("����: " + this.getAge());
		 * System.out.println("�й�: " + this.getId());
		 */
		std.showInfo();
	}
	
}
