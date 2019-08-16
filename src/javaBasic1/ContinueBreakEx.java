package javaBasic1;
public class ContinueBreakEx {
	public static void main(String[] args) {
		// Break: ë°?ë³µë¬¸?? ì¤??¨í????.
		for(int i=1;i<=5;i++) {
			if(i == 3) break;
			System.out.println(i);
		}//End of for
		
		System.out.println();
		
		// Continue: ê³????´ì?? ë°?ë³µë¬¸?? ?¤í??????.
		for(int i=1;i<=5;i++) {
			if(i == 3) continue;
			System.out.println(i);
		}//End of for

		System.out.println();
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for

		System.out.println();
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) continue;
				System.out.println("i = " + i + ", j = " + j);
			}//End of for1
		}//End of for2

		System.out.println("\nbreak ???´ë?");
		out: // ???´ë?ëª?
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) break out;
				// outê³? ê°??? ê°?ê¹??? ë°?ë³µë¬¸?? ë²??´ë????!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for

		System.out.println("\ncontinue ???´ë?");
		out: // ???´ë?ëª?
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) continue out;
				// outê³? ê°??? ê°?ê¹??? ë°?ë³µë¬¸?? ë²??´ë????!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for
	}
}
