package pk_ex3;
import javax.swing.JOptionPane;
public class Exam3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;		
		
		num=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
		
		while(num!=0){
		   if((num%2)==0)
			   System.out.println(num+"은(는) 짝수입니다");
		   else
			   System.out.println(num+"은(는) 홀수입니다");
		   num=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
		}//of while
		 System.out.println("프로그램 수행 끝!");
	}

}
