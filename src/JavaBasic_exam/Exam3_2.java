package pk_ex3;
import javax.swing.JOptionPane;
public class Exam3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;		
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �� �Է��ϼ���~"));
		
		while((num1!=0)&&(num1!=0)){
		   if(num1==num2)
			   System.out.println("Same!!!  -> "+ num1+"�� "+num2+"��(��) ���� ���Դϴ�.");
		   else
			   System.out.println("Different!!!  -> "+num1+"�� "+num2+"��(��) �ٸ� ���Դϴ�.");
		   
		   num1=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �� �Է��ϼ���~"));
			
		}//of while
		 System.out.println("���α׷� ���� ��!");
	}
}
