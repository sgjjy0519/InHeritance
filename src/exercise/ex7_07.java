// 내부 클래스, 외부클래스
package exercise;

class Outer3{
	int value = 10;
	
	class Inner3{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}
}

public class ex7_07 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner3 inner = outer.new Inner3();
		
		inner.method1();
	}

}
