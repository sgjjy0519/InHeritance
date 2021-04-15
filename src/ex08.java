//캡슐화와 접근제어자

class Time{
	private int hour; // 0~23사이의 값을 가져야함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)
			return;
		this.hour = hour;
		
	}
	
	public int getHour() {
		return hour;
	}
}

public class ex08 {


	public static void main(String[] args) {
		Time t = new Time();
			t.setHour(23);
			System.out.println(t.getHour());
			t.setHour(27);
			System.out.println(t.getHour());

	}

}
