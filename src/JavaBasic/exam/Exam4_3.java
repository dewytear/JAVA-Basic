package JavaBasic.exam;
import javax.swing.JOptionPane;
//1! + 2! + 3! + 4! + 5! ���ϱ�
public class Exam4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,fact=1, i,j;
		num=Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �ϳ� �Է��ϼ���~"));
		
		for(i=1; i<=num; i++){
			for(j=1; j<=i; j++){
			   fact=fact*j;
			}
			sum=sum+fact;			
			System.out.println(i+"! ������ ����  "+sum);
			fact=1;
		}//for	
	}//main

}
