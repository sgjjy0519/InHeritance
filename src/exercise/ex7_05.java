// 내부 클래스, 외부클래스
package exercise;

class Outer{
	class Inner{
		int iv = 100;
	}
}

public class ex7_05 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.iv);
		
		

	}

}
