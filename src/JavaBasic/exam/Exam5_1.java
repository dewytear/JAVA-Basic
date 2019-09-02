package JavaBasic.exam;
//1부터 300까지중 50단위 마다 누적값 출력

public class Exam5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Hab=0, i;
		
		for(i=1; i<=300; i++){
			Hab=Hab+i;
			if((i%50)==0)
				System.out.println(i+"일때 누적값 : "+ Hab);
		}
	}
}
