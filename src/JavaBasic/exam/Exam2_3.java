package JavaBasic.exam;

public class Exam2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, Cnt3=0, Cnt7=0, i;
		
		for(i=1; i<=50; i++){
		    if((i%3==0)){		   
			  Cnt3=Cnt3+1;
			  System.out.println(i+"�� 3�� ����̴�.");
		    }
		    else if((i%7==0)){
			  Cnt7=Cnt7+1;
			  System.out.println(i+"�� 7�� ����̴�.");    
		    }							 
		}//for
		Hab=Cnt3+Cnt7;
		System.out.println("1���� 50������ 3�� ����� 7�� ����� ������ ���� "+ Hab +"�Դϴ�!");
	}
}
