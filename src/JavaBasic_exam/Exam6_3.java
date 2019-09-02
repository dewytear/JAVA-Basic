package pk_ex6;
import javax.swing.JOptionPane ;
//1부터 N까지 숫자들의 합, 평균을 구하는 프로그램

public class Exam6_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i, hab=0, num;
	
	num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
	
	for(i=1; i<=num; i++){
		hab=hab+i;
	}
	float ave=hab/num;
	System.out.println("1부터 "+num+"까지의 합 : "+hab);
	System.out.println("1부터 "+num+"까지의 평균 : "+ave);
 }
}
