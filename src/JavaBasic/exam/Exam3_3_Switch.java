package JavaBasic.exam;

import javax.swing.JOptionPane;

public class Exam3_3_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num;		
	num=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
	switch(num){
	case 1:
		System.out.println("입금을 선택하셨습니다.");break;
	case 2:
		System.out.println("출금을 선택하셨습니다.");break;
	case 3:
		System.out.println("조회를 선택하셨습니다.");break;
	case 4:
		System.out.println("기타를 선택하셨습니다.");break;
	default:
		System.out.println("번호를 잘못 선택하셨습니다.");
	}	
	}
}
