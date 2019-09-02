package JavaBasic.exam;
public class Exam2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max=0, Hab2=0, Hab3=0, i;
		
		for(i=1; i<=50; i++){
		    if((i%2==0)){		  
			  Hab2=Hab2+i;
			  System.out.println(i+"는 2의 배수이므로 합은 "+Hab2);
		    }
		    if((i%3==0)){
		      Hab3=Hab3+i;
			  System.out.println(i+"는 3의  배수이므로 합은 "+Hab3);
		    }							 
		}//for
		if(Hab2>Hab3){
			Max=Hab2;
			System.out.println("1부터 50까지의 3의 배수의 합과 2의 배수의 합 중 큰 값은  "+ Max +"입니다!");
		}else if(Hab2<Hab3){
			Max=Hab2;
		    System.out.println("1부터 50까지의 3의 배수의 합과 2의 배수의 합 중 큰 값은  "+ Max +"입니다!");
		}else 
			System.out.println("1부터 50까지의 3의 배수의 합과 2의 배수의 합은 같습니다!");    
	}
}
