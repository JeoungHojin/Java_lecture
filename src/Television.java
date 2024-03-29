
public class Television {

	private int channel;
	int volume;
	boolean onOff;
	
	
	void Print() {
		System.out.println("텔레비전의 채널은 "+ channel+"이고, 볼륨은"+volume);
	}
	public String toString() {
		return "텔레비전의 채널은 "+ channel+"이고, 볼륨은"+volume;
	}
	public void setChannel(int newChannel) {
		//if(newChannel <1 || (int newChannel))
		channel = newChannel;
	}
}