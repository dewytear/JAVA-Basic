package JavaBasic1;
public class ForEx {

	public static void main(String[] args)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("반복문");
		}	// 변수 i(지역변수)는 for loop를 벗어나면 사라진다.
		
//		for(;;) {
//			System.out.println("무한반복");
//		}
		
		int SUM = 0;
		for(int j =1;j <= 100;j++) {
			if(j%2 == 0) {
				System.out.println(j);
				SUM = SUM + j;
				System.out.println("SUM = " + SUM);
			}
		}
		System.out.println("1부터 100까지의 합 : " + SUM + "\n\r");
		
		// 구구단 예제
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
