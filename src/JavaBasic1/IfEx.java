package JavaBasic1;
public class IfEx {

	public static void main(String[] args)
	{
		if(true);
		if(true)
			System.out.println("���̴�");
		
		if(false) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
		
		int JUMSU = 60;
		char hakjum = ' ';
		
		if(JUMSU >= 90) hakjum = 'A';
		else if(JUMSU >= 80) hakjum = 'B';
		else if(JUMSU >= 70) hakjum = 'C';
		else if(JUMSU >= 60) hakjum = 'E';
		else if(JUMSU >= 50) hakjum = 'D';
		else hakjum = 'E';
		System.out.println("����� ������ " + hakjum + " ���� �̴�");
		
		hakjum = (JUMSU >= 90)? 'A':((JUMSU >= 80)? 'B':'C');
		System.out.println("����� ������ " + hakjum + " ���� �̴�");
		
		JUMSU = 55;
		switch(JUMSU/10) {
		case 10:
		case 9:
			hakjum = 'A';
			break;
		case 8:
		case 7:
		case 6:
			hakjum = 'B';
			break;
		default :
			hakjum = 'C';
			break;
		}
		System.out.println("����� ������ " + hakjum + " ���� �̴�");
	}
}
