package com.JavaEx.collection.hash;

public class Student {
	//필드
	int id;
	String name;
	

	//생성자
public Student(String name,int id) {
	this.name=name;
	this.id =id;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	//두객체 유일 식별자 -> int
	
	return id;
}
@Override
public boolean equals(Object o) {
	if(o instanceof Student) {
	Student other = (Student)o;
	return name.equals(other.name) && id==other.id;
	}
	return super.equals(o);
}

}