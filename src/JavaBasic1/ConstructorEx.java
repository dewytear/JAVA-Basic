// Contructor Overloading
// ������: �ν��Ͻ�(��ü)�� ����(���ʷ� ����Ǵ� �޼ҵ�)�� �� ȣ���ϴ� �޼ҵ��� ����

public class ConstructorEx {

	public static void main(String[] args) {

		TextBook tb = new TextBook();
		System.out.println(tb.title);
		System.out.println(tb.author);
		
		System.out.println("--------");
		tb.getBook();
		System.out.println("--------");
		
		TextBook tb2 = new TextBook("���ű�", "�عֿ���");
		System.out.println(tb2.title);
		System.out.println(tb2.author);

		System.out.println("--------");
		tb2.getBook();
		System.out.println("--------");

		TextBook tb3 = new TextBook("������", "�ٴپ��", 100);
		System.out.println("--------");
		tb3.getBook();
		System.out.println("--------");

		TextBook tb4 = new TextBook("�׽�Ʈ��");
		System.out.println("--------");
		tb4.getBook();
		System.out.println("--------");
	}
	
}

class TextBook {
	String title;
	String author;
	int grade;
	
	// [Region] ������
	// �������� ����: ��������� �ʱ�ȭ �� �� ���
	public TextBook() {
		title = "�����Ǽ�";
		author = "ȫ�浿";
	}
	
	// ���� ������
	// this: �ڱ� Ŭ������ �ν��Ͻ� ������ ������ �� ���
	// this.�ν��Ͻ�����, this.�ν��Ͻ��޼ҵ�
	// this�� static �޼ҵ忡���� ����� �� ����.
	public TextBook(String title) {
		// this() �� �����ڸ� ȣ���ϴ� �޼ҵ�
		// this() �� ������ �ȿ����� ȣ���Ѵ�.
		// this() �� �ݵ�� �����ھȿ��� ù�ٿ� ����Ѵ�.
		this(title, "������", 50);
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
		System.out.println("����: " + title);
		System.out.println("����: " + author);
		System.out.println("���: " + grade);
	}
}