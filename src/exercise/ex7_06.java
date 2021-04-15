// 내부 클래스, 외부클래스
package exercise;

class Outer2{
	static class Inner2{
		int iv = 200;
	}
}

public class ex7_06 {

	public static void main(String[] args) {
		Outer2.Inner2 inner = new Outer2.Inner2();
		
		System.out.println(inner.iv);
	}

}
