
public class ContinueBreakEx {
	public static void main(String[] args) {
		// Break: �ݺ����� �ߴ��϶�.
		for(int i=1;i<=5;i++) {
			if(i == 3) break;
			System.out.println(i);
		}//End of for
		
		System.out.println();
		
		// Continue: ����ؼ� �ݺ����� �����϶�.
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

		System.out.println("\nbreak ���̺�");
		out: // ���̺��
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) break out;
				// out�� ���� ����� �ݺ����� �����!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for

		System.out.println("\ncontinue ���̺�");
		out: // ���̺��
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(j == 1) continue out;
				// out�� ���� ����� �ݺ����� �����!!
				System.out.println("i = " + i + ", j = " + j);
			}
		}//End of for
	}
}
