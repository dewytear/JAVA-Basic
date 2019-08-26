package PolymorphismExs;

public class PolymorphismEx3 {
	public static void main(String[] args) {
		/*
		 * Car car = new Car();
		 * DumpTruck dt = null;
		 * 
		 * car.accelUp();
		 * dt = (DumpTruck) car; // Error: 자식타입의 참조변수는 부모의 인스턴스를 참조 할 수 없다.
		 */	
		
		 Car car = new DumpTruck();
		 DumpTruck dt = null;
		 
		 car.accelUp();
		 dt = (DumpTruck) car;
		 dt.accelUp();

		 System.out.println("----------------------");
		 System.out.println("-     instanceof     -");
		 System.out.println("----------------------");
		 
		 DumpTruck dt2 = new DumpTruck();
		 if(dt2 instanceof DumpTruck) {
			 System.out.println("Type is DumpTruck.");
		 }
		 
		 if(dt2 instanceof Car){
			 System.out.println("Type is Car.");
		 }
		 
		 if(dt2 instanceof Object) {
			 System.out.println("Type is Object.");
		 }

//		 if(dt2 instanceof FireTruck) {
//			 System.out.println("Type is FireTruck.");
//		 }
	}
}

/* 동일 패키지내의 클래스는 선언없이 사용가능
 * class Car{ String color; int cntDoor;
 * 
 * public void accelUp() { System.out.println("운전!"); }
 * 
 * public void breakDown() { System.out.println("정차!"); } }
 * 
 * class FireTruck extends Car{ void launchWater() {
 * System.out.println("물 발사!"); } }
 * 
 * class DumpTruck extends Car{ void loadSand() { System.out.println("모래를 싣다!");
 * } }
 */