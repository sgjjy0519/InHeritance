//참조변수의 형변환 --- 사용할 수 있는 멤버의 갯수를 조절하는 것


public class ex09 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; 					// car = (Car)fe; 에서 형변환 생략됨
//		car.water();				// Car타입에는 참조변수의 car로는 water() 사용불가
		
		fe2 = (FireEngine)car;		// 자손타입 <= 조상타입, 형변환 생략불가.
		fe2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr");
	}
	
	void stop() {
		System.out.println("stoppppppp!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}

//class Ambulance extends Car{
//	void siren() {
//		System.out.println("wanggggggggg!");
//	}
//}
