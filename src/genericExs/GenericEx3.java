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

// extends Object가 생략되어있다.
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
//		return "사람의 이름";
//	}
//}

// T의 값을 Data1 class로 제한을 건다.
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
		
		Person1 p1 = new Person1(new StudentData1("홍길동"), new Integer(20190801));
		// StudentData 는 기본적으로 Object class를 상속함(따라서, Object의 주소를 출력)
		System.out.println(p1.data.toString() + ": " + p1.id);
//		System.out.println(p1.data.nmStudent + ": " + p1.id);
		
		p1.<StudentData1> getInfo(new StudentData1("문재인"));
		
		StudentData1 sd = new StudentData1("강감찬");
		p1.getInfo(sd);
		
		Person1 <StudentData1, Integer> p2 = new Person1(new StudentData1("이순신"), new Integer(20190802));
		// StudentData 는 기본적으로 Object class를 상속함(따라서, Object의 주소를 출력)
		System.out.println(p2.data.toString() + ": " + p1.id);
		System.out.println(p2.data.nmStudent + ": " + p1.id);
		
//		Person2 s1 = new Person2("Hi");
		
		StudentData1 sd2 = new StudentData1("고길동");
		Person2 p3 = new Person2(sd2);
		p3.getInfo(sd2);
		
	}
}
