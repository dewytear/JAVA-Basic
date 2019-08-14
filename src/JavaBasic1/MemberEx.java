package JavaBasic1;
public class MemberEx {
	// Ŭ������ �������: �Ӽ�(�ʵ�) + �޼���(������)
	
	static int aa;	// static ����
	String str;		// intance ����
	
	// ������: static�� ���� �ʴ´�.
	// ������ �κ��� ������ �Ǿ��� ��� �ڹ� �����Ϸ����� �⺻�����ڸ� �ڵ� �����Ѵ�.
	// ������ �κ��� ������� �ڵ� �������� �ʴ´�.
	// �⺻������: public MemberEx() {}
	
	public MemberEx() {
		System.out.println("Constructor");
	}
	
	// Ŭ���� �޼ҵ�
	public static void classMethod() {
		System.out.println("Class Method");
	}
	
	public static String returnClassMethod() {
		System.out.println("Return Class Method");
		return "��ȯ��";
	}
	
	// �ν�ź�� �޼ҵ�
	public void instanceMethod() {
		System.out.println("Instance Method");
	}

	public int returnInstanceMethod() {
		System.out.println("Return Instance Method");
		return 1000;
	}
	
	// �Ű������� �ִ� �޼ҵ�
	public void parameterMethod(String str1) {
		System.out.println(str1);
	}

	public String returnParameterMethod(String str1) {
		return "\nRetuen Value: " + str1; 
	}
	
	public static void main(String[] args) {
		// �����ڸ� ȣ��: ��ü�� �����Ѵٴ� �ǹ�
		MemberEx me = new MemberEx();

		classMethod();							// Ŭ���� �޼ҵ�
		me.instanceMethod();					// �ν�ź�� �޼ҵ�
		me.parameterMethod("Parameter Method");	// �Ű����� �޼ҵ�
		
		String str2 = returnClassMethod();
		System.out.println("Retuen Value: " + str2);
		
		int i = me.returnInstanceMethod();
		System.out.println("Retuen Value: " + i);
		
		System.out.println("Return Parameter Method" + me.returnParameterMethod("���̸�"));
	}
}
