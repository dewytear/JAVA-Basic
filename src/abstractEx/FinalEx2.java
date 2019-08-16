package abstractEx;

public class FinalEx2 {
	public static void main(String[] args) {
		FinalEx fe = new FinalEx();
		
		System.out.println(fe.aa);
		
		/*
		System.out.println(fe.AA);	// static 변수이므로 다른 클래스 내에서 호출하고자 한다면
		                            // (클래스.변수) 의 형식을 사용해야 한다.
		*/
		
		System.out.println(FinalEx.AA);

		fe.aa = -100;
		System.out.println(fe.aa);
//		FinalEx.AA = 200;	// final 이 붙은 변수는 변경할 수 없다.
	}
}

class FinalEx{
	// 'AA는 상수로써 변경할 수 없다.'라는 의미가 됨
	final public static int AA = 10;
						int aa = 100;
}
