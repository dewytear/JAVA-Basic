package pk_ex3;
import javax.swing.JOptionPane;
public class Exam3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;		
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 더 입력하세요~"));
		
		while((num1!=0)&&(num1!=0)){
		   if(num1==num2)
			   System.out.println("Same!!!  -> "+ num1+"과 "+num2+"은(는) 같은 수입니다.");
		   else
			   System.out.println("Different!!!  -> "+num1+"과 "+num2+"은(는) 다른 수입니다.");
		   
		   num1=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 더 입력하세요~"));
			
		}//of while
		 System.out.println("프로그램 수행 끝!");
	}
}
