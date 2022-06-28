package homework4;

public class TV {
	private boolean power= false;
	private int channel= 9;
	private int volume=20;
	
	public boolean getPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void channelUp(){
		channel+= 1;
	}
	public void channelDown() {
		channel-=1;	
	}
	public void volumeUp(){
		volume+=1;
	}
	public void volumeDown() {
		volume -=1;
	}
	public void powerOn(){
		if(power == false) {
			power = true;
			System.out.println("TV가 켜졌습니다.");
		}
		else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
}
class WatchTV {
	public static void main(String[] args){
	TV tv = new TV();
	tv.powerOn();
	System.out.printf("현재 TV채널은 %d입니다.\n",tv.getChannel()); 
	System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume()); 
	tv.setChannel(16);
	tv.channelUp();
	tv.volumeUp();
	tv.volumeUp();
	System.out.printf("현재 TV채널은 %d입니다.\n", tv.getChannel()); 
	System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume()); 
	tv.powerOn();
	} 
}
		
	
	
