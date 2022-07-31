package com.ram.springrest.entity;


public class Course {
	
	private int cid;
	private String title;
	private String writer;
	private String description;
	
	public Course(int cid, String title, String writer, String description) {
		super();
		this.cid = cid;
		this.title = title;
		this.writer = writer;
		this.description = description;
	}
	public Course() {
		super();
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", title=" + title + ", writer=" + writer + ", description=" + description + "]";
	}


}
