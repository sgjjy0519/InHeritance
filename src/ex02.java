class MyPoint{
	int x;
	int y;
}

//class Circle extends MyPoint{
//	int r;
//}

class Circle {
	MyPoint p = new MyPoint();  // 참조변수의 초기화
	int r;
}
public class ex02 {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
//		System.out.println("c.x="+c.x+"c.y="+c.y+"c.r="+c.r);
		System.out.println("c.p.x="+c.p.x+"c.p.y="+c.p.y+"c.r="+c.r);
	}

}
