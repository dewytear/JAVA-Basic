package PolymorphismExs;

public class PolymorphismEx3 {
	public static void main(String[] args) {
		/*
		 * Car car = new Car();
		 * DumpTruck dt = null;
		 * 
		 * car.accelUp();
		 * dt = (DumpTruck) car; // Error: �ڽ�Ÿ���� ���������� �θ��� �ν��Ͻ��� ���� �� �� ����.
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

/* ���� ��Ű������ Ŭ������ ������� ��밡��
 * class Car{ String color; int cntDoor;
 * 
 * public void accelUp() { System.out.println("����!"); }
 * 
 * public void breakDown() { System.out.println("����!"); } }
 * 
 * class FireTruck extends Car{ void launchWater() {
 * System.out.println("�� �߻�!"); } }
 * 
 * class DumpTruck extends Car{ void loadSand() { System.out.println("�𷡸� �ƴ�!");
 * } }
 */