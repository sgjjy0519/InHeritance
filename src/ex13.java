//인터페이스 다형성

abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable{ // 인터페이스의 모든 메서드는 public abstract.(생략)
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {   // 오버라이딩 규칙 - 조상(public)보다 접근제어자가 좁으면 안된다.
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}

}
public class ex13 { 

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 u = new Fighter();    
		//Fightable f = new Fighter();
		u.move(100, 200);
		//u.attack(new Fighter()); // Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());
		//f.stop();				   // Fightable에는 stop()이 없어서 호출불가

	}

}
