package pk_ex2;

public class Exam2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Cnt=0, i;
		
		for(i=1; i<=50; i++){
		    if((i%3==0)){		   
			  Cnt=Cnt+1;
			  System.out.println(i+"는 3의 배수이다.");
		    }			 
		}
		
		System.out.println("1부터 50까지의 3의 배수의 개수는 "+ Cnt +"입니다!");
	}
}
