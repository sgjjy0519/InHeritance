package exercise;

class Product{
	int price;
	int bonusPoint;
	
	// 기본생성자가 없으면 에러
	Product(){
		
	}
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		
	}
	
	public String toString() {
		return "Tv";
	}
}

public class ex7_02 {

	public static void main(String[] args) {
		Tv t = new Tv();

	}

}
