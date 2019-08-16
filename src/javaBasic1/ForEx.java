package javaBasic1;
public class ForEx {

	public static void main(String[] args)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("ë°?ë³µë¬¸");
		}	// ë³??? i(ì§???ë³???)?? for loopë¥? ë²??´ë??ë©? ?¬ë?¼ì???.
		
//		for(;;) {
//			System.out.println("ë¬´í??ë°?ë³?");
//		}
		
		int SUM = 0;
		for(int j =1;j <= 100;j++) {
			if(j%2 == 0) {
				System.out.println(j);
				SUM = SUM + j;
				System.out.println("SUM = " + SUM);
			}
		}
		System.out.println("1ë¶??? 100ê¹?ì§??? ?? : " + SUM + "\n\r");
		
		// êµ¬êµ¬?? ????
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
