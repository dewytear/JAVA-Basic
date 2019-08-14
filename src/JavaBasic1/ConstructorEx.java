// Contructor Overloading
// 생성자: 인스턴스(객체)를 생성(최초로 실행되는 메소드)할 때 호출하는 메소드의 일종

public class ConstructorEx {

	public static void main(String[] args) {

		TextBook tb = new TextBook();
		System.out.println(tb.title);
		System.out.println(tb.author);
		
		System.out.println("--------");
		tb.getBook();
		System.out.println("--------");
		
		TextBook tb2 = new TextBook("갈매기", "해밍웨이");
		System.out.println(tb2.title);
		System.out.println(tb2.author);

		System.out.println("--------");
		tb2.getBook();
		System.out.println("--------");

		TextBook tb3 = new TextBook("조나단", "바다어부", 100);
		System.out.println("--------");
		tb3.getBook();
		System.out.println("--------");

		TextBook tb4 = new TextBook("테스트북");
		System.out.println("--------");
		tb4.getBook();
		System.out.println("--------");
	}
	
}

class TextBook {
	String title;
	String author;
	int grade;
	
	// [Region] 생성자
	// 생성자의 역할: 멤버변수를 초기화 할 때 사용
	public TextBook() {
		title = "구가의서";
		author = "홍길동";
	}
	
	// 인자 생성자
	// this: 자기 클래스의 인스턴스 변수를 접근할 때 사용
	// this.인스턴스변수, this.인스턴스메소드
	// this는 static 메소드에서는 사용할 수 없다.
	public TextBook(String title) {
		// this() 는 생성자를 호출하는 메소드
		// this() 는 생성자 안에서만 호출한다.
		// this() 는 반드시 생성자안에서 첫줄에 써야한다.
		this(title, "문재인", 50);
//		this.title = title;
	}
	
	public TextBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public TextBook(String title, String author, int grade) {
		this.title = title;
		this.author = author;
		this.grade = grade;
	}
	// [end]
	
	public void getBook() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("등급: " + grade);
	}
}