package JavaBasic.exam;
//1+2+3+…+N  까지의 합이  500을 넘는 최초의 N과 그 합을 구하는 프로그램
public class Exam5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		i=1;
		while(true){
			Hab=Hab+i;
			if(Hab>500){
				System.out.println("합이 500을 넘는 최초의 N은 "+i+"이고");
			    System.out.println("합이 500을 넘는 최초의 합은 "+Hab+"입니다.");
			    break;
			}//of if
			i++;
		}
	}
}
