

//내부,외부 클래스

class A{                           // A는 B의 외부 클래스
	B b = new B();
	int i=100;
	
	class B{                       // B는 A의 내부 클래스
		void method() {
			System.out.println(i); // 객체 생성 없이 외부클래스 멤버 접근가능
		}
	}
}

//class B{                         // 객체를 생성해야 A클래스의 멤버 사용가능
//	void method() {
//		A a = new A();
//		System.out.println(a.i);
//	}
//}

//class C{
//	B b = new B();
//}

public class ex15 {

	public static void main(String[] args) {
//		B b = new B();
//		b.method();
		
	}

}
