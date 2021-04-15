// 추상클래스, 추상메서드

public class ex12 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};// 아래 4줄을 한줄로 작성
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(500, 500);
		}

	}

}

abstract class Unit{  // 미완성 설계도 ,, 부모 객체
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		
	}
}

class Marine extends Unit{   // 미완성 설계도를 상속받아 완성된 설계도 작성 ,,  // 자식 객체 
	void move(int x, int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
	void steampack() {
		
	}
}

class Tank extends Unit{ // 자식 객체 
	void move(int x, int y) {
		System.out.println("Tank[x="+x+",y="+y+"]");
	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{  // 자식 객체 
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+",y="+y+"]");
	}
	void load() {
		
	}
	void unload() {
		
	}
}