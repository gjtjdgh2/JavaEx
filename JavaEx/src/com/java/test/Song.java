package com.java.test;

public class Song {
	private String title,artist,album,composer;
	private int year,track;
	
	public Song(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getartist() {
		return artist;
	}
	
	public String getcomposer() {
		return composer;
	}
	
	public String getalbum() {
		return album;
	}
	public int getyear() {
		return year;
	}
	
	public int gettrack() {
		return track;
	}
	
	
	public void settitle(String title) {
		this.title=title;
	}
	
	public void setartist(String artist) {
		this.artist = artist;
	}

	public void setcomposer(String composer) {
	this.composer = composer;
}
	public void setalbum(String album) {
		this.album = album;
	}

	public void setyear(int year) {
	this.year = year;
}

	public void settrack(int track) {
	this.track=track;
}
	public void showInfo() {
		System.out.printf("%s,%s (%s, %d ,%d번 track %s 작곡)",artist,title,album,year,track,composer);
	}


	public void draw() {
		System.out.printf("%s,%s (%s, %d ,%d번 track %s 작곡)");
	}
	
	
	
}
