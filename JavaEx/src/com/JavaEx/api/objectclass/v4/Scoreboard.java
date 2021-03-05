package com.JavaEx.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable{

	// 참조형 필드
	private int[] scoares;
	
	//생성자
	public Scoreboard(int[] scoares) {
		this.scoares= scoares;
		
	}

	public int[] getScoares() {
		return scoares;
	}

	public void setScoares(int[] scoares) {
		this.scoares = scoares;
	}

	@Override
	public String toString() {
		return "Scoreboard [scoares=" + Arrays.toString(scoares) + "]";
	}
	
	
	public Scoreboard getClone() {
		Scoreboard clone =null;
		
		try {
			clone = (Scoreboard)clone(); //복제
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	//깊은 복제를 위해서 내부 참조 필드를 복제
		//clone 에서드를 재정의 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 앫은 복제 시도
		Scoreboard clone =(Scoreboard)super.clone();
		//내부 참조 필드 복제(깊은 복제)
		clone.scoares = Arrays.copyOf(scoares, scoares.length);
		return clone;
	}
}
