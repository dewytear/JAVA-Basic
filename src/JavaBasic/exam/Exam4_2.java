package JavaBasic.exam;
import javax.swing.JOptionPane ;
public class Exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1, i;
		num=Integer.parseInt(JOptionPane.showInputDialog("숫자를 하나 입력하세요~"));
		
		for(i=1; i<=num; i++){
			fact=fact*i;
			System.out.println(i+"! = "+fact);
		}//for				
	}//main
}
