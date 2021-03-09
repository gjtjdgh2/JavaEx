package com.JavaEx.collection.hash;

public class ClassRoom {
private String subject;
private String roomName;

public ClassRoom(String subject,String roomName) {
	this.subject = subject;
	this.roomName=roomName;
	
}

public ClassRoom(String subject) {
	this.subject=subject;
}
@Override
public String toString() {
	return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
}

@Override
public int hashCode() {
	//가정: 과목은 같으나 강의실은 다를수있다
	//괌고의 해시코드가 같으면 식별자가 같은걸로함
	
	return subject.hashCode();
}

@Override
public boolean equals(Object obj) {
	
	if(obj instanceof ClassRoom) {
		//다운 캐스팅
		ClassRoom other = (ClassRoom)obj;
		return subject.equals(other.subject); 
	}
	return super.equals(obj);



}
}