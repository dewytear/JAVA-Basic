package JavaBasic.exam;
import javax.swing.JOptionPane ;
//소수인지를 판별하는프로그램
public class Exam6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
		for(i=2; i<=num-1; i++){
			if((num%i)==0){
				System.out.println(num+"은 소수가 아닙니다!");
				break;
			}else{
				System.out.println(num+"은 소수입니다!");
				break;
			}//else		
		}//of for
	}//of main
}//of class
