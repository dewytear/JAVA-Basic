package genericExs;

class StudentData1 implements Data1{
	public String nmStudent;
	StudentData1(String name){
		this.nmStudent = name;
	}
	
	public String toString() {
		return nmStudent;
	}
	
	public int getData() {
		return 1234;
	}
}

// extends Object�� �����Ǿ��ִ�.
class Person1 <T,E>{
	public T data;
	public E id;
	Person1(T data, E id){
		this.data = data;
		this.id = id;
	}
	
	public <T> void getInfo(T data) {
		System.out.println(data);
	}
}

interface Data1{
	int getData();
}

//class Data{
//	public String getData() {
//		return "����� �̸�";
//	}
//}

// T�� ���� Data1 class�� ������ �Ǵ�.
class Person2 <T extends Data1>{
	public T data;
	Person2(T data){
		this.data = data;
	}
	
	public <T> void getInfo(T data) {
		System.out.println(data);
	}
}

public class GenericEx3 {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1(new StudentData1("ȫ�浿"), new Integer(20190801));
		// StudentData �� �⺻������ Object class�� �����(����, Object�� �ּҸ� ���)
		System.out.println(p1.data.toString() + ": " + p1.id);
//		System.out.println(p1.data.nmStudent + ": " + p1.id);
		
		p1.<StudentData1> getInfo(new StudentData1("������"));
		
		StudentData1 sd = new StudentData1("������");
		p1.getInfo(sd);
		
		Person1 <StudentData1, Integer> p2 = new Person1(new StudentData1("�̼���"), new Integer(20190802));
		// StudentData �� �⺻������ Object class�� �����(����, Object�� �ּҸ� ���)
		System.out.println(p2.data.toString() + ": " + p1.id);
		System.out.println(p2.data.nmStudent + ": " + p1.id);
		
//		Person2 s1 = new Person2("Hi");
		
		StudentData1 sd2 = new StudentData1("��浿");
		Person2 p3 = new Person2(sd2);
		p3.getInfo(sd2);
		
	}
}
