package pk_ex3;

import javax.swing.JOptionPane;

public class Exam3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String imsi;
	char ch;
	imsi=JOptionPane.showInputDialog("문자를 하나 입력하세요~");
	ch=imsi.charAt(0);
	if((ch>=65) && (ch<=90))
		System.out.println("Uppercase");	
	else if((ch>=97) && (ch<=122))
		System.out.println("Lowercase");
	
	System.out.println(ch);

	}

}
