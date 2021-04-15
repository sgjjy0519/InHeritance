// 매개변수 다형성!!

class Product{
	int price;             // 제품가격
	int bonusPoint;		   // 제품구매 시 보너스 포인트
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1(){
		//조상클래스의 생성자 Product(int price)를 호출
		super(100);  // Tv의 가격을 100으로 설정
	}
	
	public String toString() { // 객체를 문자로 표현 ,, Object클래스의 toString()을 오버라이딩
		return "Tv1";
	}
}

class Computer1 extends Product {
	Computer1(){
		super(50);
	}
	
	public String toString() {
		return "Computer1";
	}
}


// 바이어, 구매자
class Buyer{
	int money = 1000;     // 바이어의 소유금액
	int bonusPoint = 0;   // 보너스포인트
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;                         // 소유금액 -= 제품가격
		bonusPoint += p.bonusPoint;				  // 보너스포인트 += 제품 보너스포인트
		System.out.println(p+"를 구입하셨습니다.");
	}
}


public class ex10 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer1());
		b.buy(new Tv1());
		
		System.out.println("현재 잔액은"+b.money+"보너스포인트는"+b.bonusPoint+"입니다.");

	}

}
