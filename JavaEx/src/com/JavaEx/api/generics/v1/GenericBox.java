package com.JavaEx.api.generics.v1;

//솔계시 내부 타입을 지정하지 않음
public class GenericBox<T> {
	private T contant;

	public T getContant() {
		return contant;
	}

	public void setContant(T contant) {
		this.contant = contant;
	}
	
}
