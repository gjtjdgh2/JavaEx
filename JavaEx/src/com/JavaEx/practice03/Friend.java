package com.JavaEx.practice03;

public class Friend {

	private String name,hp,school;
	public void show() {
		System.out.println("이름: "+ getName()+"핸드폰: "+getHp()+"학교: "+getSchool());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
