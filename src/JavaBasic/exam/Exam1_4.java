package JavaBasic.exam;

public class Exam1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=30; i++){
			if((i%3)==0){ 	
			  Hab = Hab + i;
			  System.out.println(i+"�� 3�� ����̹Ƿ� ���� "+Hab);
			}  
		}
		
		System.out.println("1���� 30����  3�� ����� ���� "+ Hab +"�Դϴ�!");		

	}
}
