package JavaBasic.exam;
//1+2+3+��+N  ������ ����  500�� �Ѵ� ������ N�� �� ���� ���ϴ� ���α׷�
public class Exam5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		i=1;
		while(true){
			Hab=Hab+i;
			if(Hab>500){
				System.out.println("���� 500�� �Ѵ� ������ N�� "+i+"�̰�");
			    System.out.println("���� 500�� �Ѵ� ������ ���� "+Hab+"�Դϴ�.");
			    break;
			}//of if
			i++;
		}
	}
}
