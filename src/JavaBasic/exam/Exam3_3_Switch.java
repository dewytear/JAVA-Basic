package JavaBasic.exam;

import javax.swing.JOptionPane;

public class Exam3_3_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num;		
	num=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
	switch(num){
	case 1:
		System.out.println("�Ա��� �����ϼ̽��ϴ�.");break;
	case 2:
		System.out.println("����� �����ϼ̽��ϴ�.");break;
	case 3:
		System.out.println("��ȸ�� �����ϼ̽��ϴ�.");break;
	case 4:
		System.out.println("��Ÿ�� �����ϼ̽��ϴ�.");break;
	default:
		System.out.println("��ȣ�� �߸� �����ϼ̽��ϴ�.");
	}	
	}
}
