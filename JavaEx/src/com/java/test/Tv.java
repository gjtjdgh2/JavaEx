package com.java.test;

public class Tv {

	private int channel,volume;
	private boolean power;
	
	public int getvolume() {
		return volume;
	}
	public int getchannel() {
		return channel;
	}
	public boolean getpower() {
		return power;
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	void power(boolean power) {
		this.power = power;
	}
	void channel(int channel) {
		if(channel>255) {
			channel = 255;
		}else if(channel<1) {
			channel = 1;
		}
		this.channel = channel;
		
	}
	
	void channel(boolean up) {
		if(up == true) {
			this.channel++;
			if(this.channel>255) {
				this.channel = 255;
			}
		}else {
			this.channel--;
			if(this.channel<1) {
				this.channel = 1;
			}
		}
	}
	
	void volume(int volume) {
		if(volume>100) {
			volume =100;
		}else if(volume<0) {
			volume =0;
		}
		this.volume = volume;
	
	}
	
	void volume(boolean up) {
		if(up == true) {
			this.volume++;
			if(this.volume>100) {
				this.volume = 100;
			}
		}else {
			this.volume--;
			if(this.volume<0) {
				this.volume = 0;
			}
		}
	}
	public void status() {
		System.out.printf("%d채널,%d 볼륨 , TV 상태 %b %n",getchannel(),getvolume(),getpower());
	}
}
