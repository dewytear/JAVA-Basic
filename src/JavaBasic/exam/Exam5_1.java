package JavaBasic.exam;
//1���� 300������ 50���� ���� ������ ���

public class Exam5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=300; i++){
			Hab=Hab+i;
			if((i%50)==0)
				System.out.println(i+"�϶� ������ : "+ Hab);
		}
	}
}
