package abstractEx;

public class FinalEx2 {
	public static void main(String[] args) {
		FinalEx fe = new FinalEx();
		
		System.out.println(fe.aa);
		
		/*
		System.out.println(fe.AA);	// static �����̹Ƿ� �ٸ� Ŭ���� ������ ȣ���ϰ��� �Ѵٸ�
		                            // (Ŭ����.����) �� ������ ����ؾ� �Ѵ�.
		*/
		
		System.out.println(FinalEx.AA);

		fe.aa = -100;
		System.out.println(fe.aa);
//		FinalEx.AA = 200;	// final �� ���� ������ ������ �� ����.
	}
}

class FinalEx{
	// 'AA�� ����ν� ������ �� ����.'��� �ǹ̰� ��
	final public static int AA = 10;
						int aa = 100;
}
