package PolymorphismExs;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		Car car = null;

		FireTruck ft = new FireTruck();
		ft.launchWater();
		
		DumpTruck dt = new DumpTruck();
		dt.loadSand();
		
		/* car 는 null값을 가리키기 때문에 ft의 메소드를 호출할 수 없다.
		 * ft = (FireTruck)car;
		 * ft.launchWater();
		 */
		
//		ft = (FireTruck)dt;		// 상속관계가 아니기 떄문에 형변환을 할 수가 없다.
		System.out.println("------");
		car = ft;				// UpCasting 자식 -> 부모타입으로 변환 (Casting을 생략)
//		car.launchWater();
		car.accelUp();
		car.breakDown();

		System.out.println("------");
		ft = (FireTruck)car;	// DownCasting 부모 -> 자식으로 형변환 
		ft.launchWater();		// car의 형변환이 이루어짐
		ft.accelUp();
		ft.breakDown();
	}

}

class Car{
	String color;
	int cntDoor;
	
	public void accelUp() {
		System.out.println("운전!");
	}
	
	public void breakDown() {
		System.out.println("정차!");
	}
}

class FireTruck extends Car{
	void launchWater() {
		System.out.println("물 발사!");
	}
}

class DumpTruck extends Car{
	void loadSand() {
		System.out.println("모래를 싣다!");
	}
}