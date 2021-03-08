package com.JavaEx.api.generics.v2;

//솔계시 내부 타입을 지정하지 않음
//T 타입
//R 리턴 타입
//K 키
//V 값 value

public class GenericBox<K,V> {
	K key;
	V contant;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getContant() {
		return contant;
	}
	public void setContant(V contant) {
		this.contant = contant;
	}
	
	
}
