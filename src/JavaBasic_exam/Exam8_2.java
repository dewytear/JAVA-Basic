package pk_ex8;

public class Exam8_2 {

	public static void main(String[] args) {
		  int i, j ;
		   for(i=1; i<=5 ; i++){
		      for(j=1; j<=i ; j++)
		          if(j%2 == 0) 
		        	  System.out.print("£Ü");
		          else
		        	  System.out.print("$");
		      System.out.print("\n");
		      }//of outer-for
		   }//of main
}//of class
