import javax.swing.JOptionPane;
public class Exam10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int num, i,sum;         
	     num=Integer.parseInt(JOptionPane.showInputDialog("값입력 하세요~"));
	     System.out.print(num+"의 약수는 : "+1+", ");
	     sum=1;
	     for(i=2; i<=(num-1); i++){
	        if((num%i)==0){		
	        	System.out.print(i+", ");	
	        	sum=sum+i;
	        }//of if
	     }//of for		     
		    System.out.print(num+" 입니다!");	
		    System.out.println("\n");
		    if(sum == num)
		    	System.out.println(num+"은 완전수입니다!");
		    else 
		    	System.out.println(num+"은 완전수가 아닙니다!");		    	
	    }//of main
	}//of class