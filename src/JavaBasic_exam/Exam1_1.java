package pk_ex1;

public class Exam1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=10; i++){
			if((i%2)==0){			
			  Hab = Hab + i;
			  System.out.println("i가 "+i+"일때 : "+Hab);
			}  
		}
		
		System.out.println("1부터 10까지의 합은 "+ Hab +"입니다!");		

	}

}
