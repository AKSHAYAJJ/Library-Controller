package com.example.demo;

import org.springframework.data.annotation.Id;

public class Book1 {
	
	@Id
	private int id;
	private String bookName;
	private String authorName;
	private String language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", bookName=" + bookName + "]";
	}

}