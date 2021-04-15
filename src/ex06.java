class Point4{
	int x;
	int y;
	
	Point4(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + "y :" + y;
	}
}

class Point4D extends Point4 {
	int z;
	
	Point4D(int x, int y ,int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :"+z;
	}
}
public class ex06 {

	public static void main(String[] args) {
		Point4D p = new Point4D(1,2,3);
		System.out.println(p.getLocation());

	}

}
