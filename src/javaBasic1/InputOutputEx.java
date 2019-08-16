package javaBasic1;
// System.in
import java.io.*;

// Scanner
import java.util.*;

// IO �����
public class InputOutputEx {

	// JVM���� main �޼��带 ���� ó���� ȣ���Ѵ�.
	public static void main(String[] args) 
	throws IOException {

			// [Region]: Output
			System.out.println(args.length);
			System.out.println();
			
//			for(int i=0;i<args.length;i++)
//			{
//				System.out.println(args[i]);
//			}
			
			// Run Configuration - arguments ���� args ���� ������
			
			// for Each: �迭�� �Բ� ����� �� ������ �ݺ���
			// for(���� : �迭����) {}
			for(String str : args) {
				System.out.println(str);
			}// [end]
			
			// [Region]: Input
			System.out.println("\n\r0~9 ������ ���� �Է��Ͻÿ�...");
			int n = System.in.read()-'0';	// ASCII������ ��ȯ�Ѵ�. ('0'�� �ƽ�Ű���� ���־� ���ڷ� ǥ���Ѵ�)
			// 0~9 ������ ����: 48~57
			System.out.println(n);
			// [end]

			// [Region]: Scanner class�� ����� �����
			System.out.println("�̸��� ���̸� �Է��Ͻÿ�...");
			Scanner sc = new Scanner(System.in);
			System.out.println("����� �̸��� " + sc.next() + "�Դϴ�.");
			System.out.println("����� ���̴� " + sc.next() + "�� �Դϴ�.");
			// [end]
			
			// [Region]: in class�� ����� �����
			System.out.println("���� �Է��Ͻÿ�...");
			InputStreamReader id = new InputStreamReader(System.in);
			while(true) {
				int m = id.read();
				if(m == -1) {	// ASCII ���� -1 �� ���: Ctrl+Z
					System.out.println("break");
					break;
				}
				else System.out.println((char)m);
			}
			// [end]

			sc.close();	// Resource leak ���� ���� ��ȯ��ġ
	}

}
