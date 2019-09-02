package JavaBasic.exam;
public class Exam7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		   for(i=5; i>=1 ; i--){
			      for(j=1; j<=5 ; j++){
			          if(i==j)
			        	  System.out.print(j+" ");	 //i¸¦ Âï¾îµµ µÊ
			          else
			        	  System.out.print("  ");
			      }//of inner-for
			System.out.println("\n");
		   }
    }//main
}//class
