class Tv{
	boolean power; // 전원상태(온/오프)
	int channel;   // 채널

	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv{
	boolean caption; // 자막상태(온/오프)
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class ex01 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;					// 조상클래스(Tv)로부터 상속받은 멤버
		stv.channelUp();					// 조상클래스(Tv)로부터 상속받은 멤버
		System.out.println(stv.channel);
		
		stv.displayCaption("자막나와라~");
		stv.caption = true;
		stv.displayCaption("자막나왔다~");
		
		stv.caption = false;           	// 자막 다시 off
		stv.displayCaption("자막나와라~");
	}

}
