package JavaBasic.exam;
public class Exam2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max=0, Hab2=0, Hab3=0, i;
		
		for(i=1; i<=50; i++){
		    if((i%2==0)){		  
			  Hab2=Hab2+i;
			  System.out.println(i+"�� 2�� ����̹Ƿ� ���� "+Hab2);
		    }
		    if((i%3==0)){
		      Hab3=Hab3+i;
			  System.out.println(i+"�� 3��  ����̹Ƿ� ���� "+Hab3);
		    }							 
		}//for
		if(Hab2>Hab3){
			Max=Hab2;
			System.out.println("1���� 50������ 3�� ����� �հ� 2�� ����� �� �� ū ����  "+ Max +"�Դϴ�!");
		}else if(Hab2<Hab3){
			Max=Hab2;
		    System.out.println("1���� 50������ 3�� ����� �հ� 2�� ����� �� �� ū ����  "+ Max +"�Դϴ�!");
		}else 
			System.out.println("1���� 50������ 3�� ����� �հ� 2�� ����� ���� �����ϴ�!");    
	}
}
