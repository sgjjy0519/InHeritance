class Point3{
	int x;
	int y;
	
	String getLocation() {
		return "x:"+x+"y:"+y;
	}
}

class MyPoint3D extends Point3 {
	int z;
	
	public String toString() {
		return "x:"+x+"y:"+y;
	}
	
//	// 조상의 getLocation()을 오버라이딩.
//	String getLocation() {
//		return "x: "+x+", y:"+y+", z:"+z;
//	}
}

public class ex03 {

	public static void main(String[] args) {
		MyPoint3D p = new MyPoint3D();
		p.x= 3;
		p.y=5;
		System.out.println(p);
		System.out.println(p.toString());
		
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		
//		System.out.println(p.getLocation());
	}

}
