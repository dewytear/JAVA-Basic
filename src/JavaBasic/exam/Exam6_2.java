package JavaBasic.exam;
//구구단 출력
public class Exam6_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i, j;
		
	for(i=1; i<=9; i++){
	  for(j=1; j<=9; j++){
		System.out.print(i+"×"+j+"="+(i*j)+" ");		
	  }//of for
	  System.out.print("\n");
	}//of outer for
}//of main
}//of class
