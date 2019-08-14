
public class ContinueBreakEx {
	public static void main(String[] args) {
		// Break: 반복문을 중단하라.
		for(int i=1;i<=5;i++) {
			if(i == 3) break;
			System.out.println(i);
		}//End of for
		
		System.out.println();
		
		// Continue: 계속해서 반복문을 실행하라.
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

		System.out.println("\nbreak 레이블");
		out: // 레이블명
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) break out;
				// out과 가장 가까운 반복문을 벗어나라!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for

		System.out.println("\ncontinue 레이블");
		out: // 레이블명
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) continue out;
				// out과 가장 가까운 반복문을 벗어나라!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for
	}
}
