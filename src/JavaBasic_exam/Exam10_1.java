import javax.swing.JOptionPane;
public class Exam10_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int num, i;	     
	     
	     num=Integer.parseInt(JOptionPane.showInputDialog("���Է� �ϼ���~"));
	     System.out.print(num+"�� ����� : "+1+", ");
	     
	     for(i=2; i<=(num-1); i++){
	        if((num%i)==0){		
	        	System.out.print(i+", ");		
	        }//of if
	     }//of for		     
		    System.out.print(num+" �Դϴ�!");	     
	    }//of main
	}//of class
