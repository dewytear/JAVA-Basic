import javax.swing.JOptionPane;
public class Exam10_3 {
	
	public static int gcd(int a, int b){
		while(a != b){
			if(a>b)
				a=a-b;
			else if(b>a)
				b=b-a;
		}//while
		return a;
	}
	
	public static int lcm(int a, int b){
		return((a*b)/gcd(a,b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num1, num2,imsi1, imsi2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("���Է� �ϼ���~"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("���Է� �ϼ���~"));
		imsi1=gcd(num1,num2);
		imsi2=lcm(num1,num2);
		System.out.println(num1+"��(��) "+num2+"�� �ִ������� "+imsi1+"�Դϴ�.");
		System.out.println(num1+"��(��) "+num2+"�� �ּҰ������ "+imsi2+"�Դϴ�.");
	}

}
