package javaBasic2.genericExs;

class Demo{
	public Integer data;
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
}

// Generic class: Ÿ���� �ܺο��� ����
class GenericDemo <T>{
	public T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx1 {

	public static void main(String[] args) {
		System.out.println("-�Ϲ�Ŭ����ȣ��-----------------");
		Demo d1 = new Demo();
//		Interger ing = new Integer(100);
		
		d1.setData(new Integer(100));
		System.out.println("data: " + d1.getData());

		System.out.println("\n-���׸�Ŭ����ȣ��---------------");
		GenericDemo<Integer> gd1 = new GenericDemo<Integer>();
		gd1.setData(100);	// gd.setData(new Integer(100));
		System.out.println("data: " + gd1.getData());

		GenericDemo<String> gd2 = new GenericDemo<String>();
		gd2.setData("Hi~");	// gd.setData(new String("Hi~"));
		System.out.println("data: " + gd2.getData());
	}

}
