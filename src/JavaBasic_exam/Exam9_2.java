package pk_ex9;

public class Exam9_2 {

	public static void main(String[] args) {
		   int i, j ;

		   for(i=5; i>=1 ; i--){
		      for(j=1; j<=5 ; j++){
		          if(j==i)
		        	  System.out.print("@");
		          else if(j>i)
		        	  System.out.print("$");
		          else
		        	  System.out.print(" ");
		      }//of inner-for
		      System.out.print("\n");
		   }//of outer-for
		}//of main
}//class

