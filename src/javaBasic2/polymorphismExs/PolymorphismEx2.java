package javaBasic2.polymorphismExs;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		Car car = null;

		FireTruck ft = new FireTruck();
		ft.launchWater();
		
		DumpTruck dt = new DumpTruck();
		dt.loadSand();
		
		/* car ?? nullê°??? ê°?ë¦¬í?¤ê¸° ??ë¬¸ì?? ft?? ë©?????ë¥? ?¸ì??? ?? ????.
		 * ft = (FireTruck)car;
		 * ft.launchWater();
		 */
		
//		ft = (FireTruck)dt;		// ????ê´?ê³?ê°? ????ê¸? ??ë¬¸ì?? ??ë³????? ?? ??ê°? ????.
		System.out.println("------");
		car = ft;				// UpCasting ???? -> ë¶?ëª¨í?????¼ë? ë³??? (Casting?? ????)
//		car.launchWater();
		car.accelUp();
		car.breakDown();

		System.out.println("------");
		ft = (FireTruck)car;	// DownCasting ë¶?ëª? -> ?????¼ë? ??ë³??? 
		ft.launchWater();		// car?? ??ë³????? ?´ë£¨?´ì?
		ft.accelUp();
		ft.breakDown();
	}

}

class Car{
	String color;
	int cntDoor;
	
	public void accelUp() {
		System.out.println("?´ì??!");
	}
	
	public void breakDown() {
		System.out.println("??ì°?!");
	}
}

class FireTruck extends Car{
	void launchWater() {
		System.out.println("ë¬? ë°???!");
	}
}

class DumpTruck extends Car{
	void loadSand() {
		System.out.println("ëª¨ë??ë¥? ?£ë??!");
	}
}