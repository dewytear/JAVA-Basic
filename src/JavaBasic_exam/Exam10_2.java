import javax.swing.JOptionPane;
public class Exam10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int num, i,sum;         
	     num=Integer.parseInt(JOptionPane.showInputDialog("���Է� �ϼ���~"));
	     System.out.print(num+"�� ����� : "+1+", ");
	     sum=1;
	     for(i=2; i<=(num-1); i++){
	        if((num%i)==0){		
	        	System.out.print(i+", ");	
	        	sum=sum+i;
	        }//of if
	     }//of for		     
		    System.out.print(num+" �Դϴ�!");	
		    System.out.println("\n");
		    if(sum == num)
		    	System.out.println(num+"�� �������Դϴ�!");
		    else 
		    	System.out.println(num+"�� �������� �ƴմϴ�!");		    	
	    }//of main
	}//of class