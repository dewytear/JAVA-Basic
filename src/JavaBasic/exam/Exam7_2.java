package JavaBasic.exam;

public class Exam7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1 ; i<=5 ; i++){
			for(j=1; j<=i ; j++){
				if(i==j)
				   System.out.print(j+" ");	
				else
				System.out.print("  ");
			}//inner for
			System.out.println("\n");	
	     }//outer for
    }//main
}//class