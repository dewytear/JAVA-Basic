package JavaBasic1;
public class ForEx {

	public static void main(String[] args)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("�ݺ���");
		}	// ���� i(��������)�� for loop�� ����� �������.
		
//		for(;;) {
//			System.out.println("���ѹݺ�");
//		}
		
		int SUM = 0;
		for(int j =1;j <= 100;j++) {
			if(j%2 == 0) {
				System.out.println(j);
				SUM = SUM + j;
				System.out.println("SUM = " + SUM);
			}
		}
		System.out.println("1���� 100������ �� : " + SUM + "\n\r");
		
		// ������ ����
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
