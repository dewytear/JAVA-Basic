package genericExs;

class StudentData{
	public String nmStudent;
	StudentData(String name){
		this.nmStudent = name;
	}
	
//	public String toString() {
//		return name;
//	}
}

class Person <T,E>{
	public T data;
	public E id;
	Person(T data, E id){
		this.data = data;
		this.id = id;
	}
}

public class GenericEx2 {

	public static void main(String[] args) {
		
		Person <StudentData, Integer> p1 = new Person <StudentData, Integer>(new StudentData("홍길동"), new Integer(20190801));
		// StudentData 는 기본적으로 Object class를 상속함(따라서, Object의 주소를 출력)
		System.out.println(p1.data.toString() + ": " + p1.id);
		System.out.println(p1.data.nmStudent + ": " + p1.id);
		
	}
}
