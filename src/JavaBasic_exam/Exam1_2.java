package pk_ex1;

public class Exam1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=10; i++){
			if((i%2)==0){			
			  Hab = Hab + i;
			  System.out.println(i+"는 짝수이므로 합은 "+Hab);
			}  
		}
		
		System.out.println("1부터 10까지 짝수의 합은 "+ Hab +"입니다!");		

	}

}
