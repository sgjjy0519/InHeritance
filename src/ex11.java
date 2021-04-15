class Product2{
	int price;
	int bonusPoint;
	
	Product2(){
		
	}
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100);         // 조상클래스의 생성자 Product2(int price) 호출
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i=0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;							// 제품을 Product[] cart에 저장한다.
 		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {							// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;							// 구입물품 가격합계
		String itemList = "";					// 구입한 물품목록
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ","; 
		}
		System.out.println("구입하신 물품의 총금액은 " +sum+"만원입니다.");
		System.out.println("구입하신 제품은 " +itemList+"입니다.");
	}
}
public class ex11 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Tv2());
		b.summary();

	}

}
