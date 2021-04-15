package exercise;

class SutdaDeck{
	final int CARD_NUM = 20;  //상수
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	// 객체배열 SutdaCard에 SutdaCard 인스턴스를 생성해 저장
	
	SutdaDeck() { 
		//배열의 크기만큼 SutdaCard인스턴스를 생성해야한다.
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1;   // 나머지에 +1 : 1,2,3,4...10
			boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	// cards 배열에 담긴 카드의 위치를 뒤섞음
	void shuffle() {
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length); 
			
			// cards[i]와 cards[j]의 값을 서로 바꾼다.
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	// cards 배열에서 지정된 위치의 SutdaCard를 반환
	public SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) // index의 유효성을 검사한다.
			return null;
		return cards[index];
	}
	
	// cards 배열에서 임의의 위치의 SutdaCard를 반환
	public SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);  // pick(int index)를 호출
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang =isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class ex7_01 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		
		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
