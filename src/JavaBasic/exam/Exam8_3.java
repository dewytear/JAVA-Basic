package JavaBasic.exam;

public class Exam8_3 {

	public static void main(String[] args) {
		   int i, j ;
		   for(i=5; i>=1 ; i--){
		      for(j=1; j<=i ; j++)
		          if(i == j) 
		        	  System.out.print(" @ ");
		          else
		        	  System.out.print(" $ ");          
		      System.out.println("\n");
		   }//of outer-for
		}//of main
}//of class
