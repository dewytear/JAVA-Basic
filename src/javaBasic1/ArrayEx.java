package JavaBasic1;
public class ArrayEx {
	public static void main(String[] args) {
		// [Region] 諛곗��
		int[] a;
		a = new int[3];
//		[Region] 蹂��� 媛� 吏���
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
//		a[3] = 400;
//		[end]
		System.out.println(a[0]);
		System.out.println(a.length);

		int j[] = {10, 20, 30, 40};
		System.out.println("j[0] = " + j[0]);
		System.out.println("j[1] = " + j[1]);
		System.out.println("j[2] = " + j[2]);
		System.out.println("j[3] = " + j[3]);
		System.out.println(j.length);

		int b[];
		b = j;
		for(int i=0;i<3;i++)
		{
			System.out.println("b[" + i + "] = " + b[i]);
		}
		// [end]

		// [Region] 媛�蹂� 諛곗��
		char ch [][] = new char[3][];	// 3��
		System.out.println("ch 諛곗�댁�� (��)�ш린: " + ch.length);
		ch[0] = new char[3];
		System.out.println("ch[0] 諛곗�댁�� (��)�ш린: " + ch[0].length);
		ch[1] = new char[2];
		System.out.println("ch[1] 諛곗�댁�� (��)�ш린: " + ch[1].length);
		ch[2] = new char[1];

		ch[0][0] = 'A';ch[0][1] = 'B';ch[0][2] = 'C';
		ch[1][0] = 'D';ch[1][1] = 'E';
		ch[2][0] = 'F';

		for(int i=0;i<ch.length;i++) {
			for(int k=0;k<ch[i].length;k++) {
				System.out.print("\t" + ch[i][k]);
			}
			System.out.println();
		}

		String str[][] = {{"����", "諛⑷�", "鍮�鍮�"},{"�щ��", "�щ�"}};

		for(int i=0;i<str.length;i++) {
			for(int k=0;k<str[i].length;k++) {
				System.out.print("\t" + str[i][k]);
			}
			System.out.println();
		}
		// [end]
	}
}
