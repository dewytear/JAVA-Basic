package JavaBasic.exam;

public class Exam1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=30; i++){
			if((i%3)==0){ 	
			  Hab = Hab + i;
			  System.out.println(i+"는 3의 배수이므로 합은 "+Hab);
			}  
		}
		
		System.out.println("1부터 30까지  3의 배수의 합은 "+ Hab +"입니다!");		

	}
}
