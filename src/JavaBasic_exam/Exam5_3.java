package pk_ex5;
import javax.swing.JOptionPane ;
//여러 개의 수를 입력받아 순서대로 나열하는 구하는 프로그램
public class Exam5_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat[]=new int[10];
		int max=0, num,i=0,j,k,temp=0;		
		num=Integer.parseInt(JOptionPane.showInputDialog("값입력~"));
		while (num!=0){
		  dat[i]=num;
		  num=Integer.parseInt(JOptionPane.showInputDialog("값입력~"));
		  i++;		
		}
		System.out.println("입력데이타");
		for(j=0;j<i;j++)
		  System.out.print(dat[j]+"   ");
		System.out.println("\n");
		
		for(j=0;j<i;j++){
		  for(k=0; k<i-1; k++){
			if(dat[k]>dat[k+1]){
				temp=dat[k+1];
				dat[k+1]=dat[k];
				dat[k]=temp;
			}//if
	      }//inner for  
        }//outer for
		System.out.println("정렬한 결과");
		for(j=0;j<i;j++)
			  System.out.print(dat[j]+"   ");
	}//main
}//class