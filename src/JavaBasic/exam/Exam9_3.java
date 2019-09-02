package JavaBasic.exam;

public class Exam9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1 ; i<=5 ; i++){
			for(j=1; j<=i ; j++){
				System.out.print("$ ");				
			}//inner for
			System.out.print("\n");				
		}//outer for
			
	   for(i=4; i>=1 ; i--){
		    for(j=1; j<=i ; j++)
		         System.out.print("$ ");          
			System.out.print("\n");
	   }//of outer-for	
	}
}
