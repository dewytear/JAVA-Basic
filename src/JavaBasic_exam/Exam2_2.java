package pk_ex2;

public class Exam2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Cnt=0, i;
		
		for(i=1; i<=50; i++){
		    if((i%3==0)){		   
			  Cnt=Cnt+1;
			  System.out.println(i+"�� 3�� ����̴�.");
		    }			 
		}
		
		System.out.println("1���� 50������ 3�� ����� ������ "+ Cnt +"�Դϴ�!");
	}
}
