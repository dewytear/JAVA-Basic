package pk_ex3;
import javax.swing.JOptionPane;
public class Exam3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;		
		
		num=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
		
		while(num!=0){
		   if((num%2)==0)
			   System.out.println(num+"��(��) ¦���Դϴ�");
		   else
			   System.out.println(num+"��(��) Ȧ���Դϴ�");
		   num=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
		}//of while
		 System.out.println("���α׷� ���� ��!");
	}

}
