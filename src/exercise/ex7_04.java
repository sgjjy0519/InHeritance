package exercise;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; // 이전채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		
		prevChannel = this.channel;  //현재 채널을 이전채널에 저장한다.
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
		
	}
}

public class ex7_04 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	

	}

}

