package JavaBasic.exam;
import javax.swing.JOptionPane ;
//�Ҽ������� �Ǻ��ϴ����α׷�
public class Exam6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("���Է�"));
		for(i=2; i<=num-1; i++){
			if((num%i)==0){
				System.out.println(num+"�� �Ҽ��� �ƴմϴ�!");
				break;
			}else{
				System.out.println(num+"�� �Ҽ��Դϴ�!");
				break;
			}//else		
		}//of for
	}//of main
}//of class
