package JavaBasic.exam;
//1*2 + 2*3 + 3*4 +¡¦ + 11*12  ±¸ÇÏ±â
public class Exam4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int i, sum, imsi;
	   sum = 0;

	   for(i=1; i<=11 ; i++){
	      imsi = i*(i+1);
	      sum += imsi;
	      if(i < 11)   
	    	  System.out.print(i+"*"+(i+1)+"+");
	      else 
	    	  System.out.println(i+"*"+(i+1)+"=");
	    }//of-for
	   System.out.println(sum);
	}

}
