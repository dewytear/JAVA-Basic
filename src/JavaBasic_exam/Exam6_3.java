package pk_ex6;
import javax.swing.JOptionPane ;
//1���� N���� ���ڵ��� ��, ����� ���ϴ� ���α׷�

public class Exam6_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i, hab=0, num;
	
	num=Integer.parseInt(JOptionPane.showInputDialog("���Է�"));
	
	for(i=1; i<=num; i++){
		hab=hab+i;
	}
	float ave=hab/num;
	System.out.println("1���� "+num+"������ �� : "+hab);
	System.out.println("1���� "+num+"������ ��� : "+ave);
 }
}
