package JavaBasic.exam;

public class Exam1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=10; i++){
			if((i%2)!=0){ //if((i%2)==1)���嵵 �ȴ�.	
			  Hab = Hab + i;
			  System.out.println(i+"�� Ȧ���̹Ƿ� ���� "+Hab);
			}  
		}
		
		System.out.println("1���� 10���� Ȧ���� ���� "+ Hab +"�Դϴ�!");		

	}

}
