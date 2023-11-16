package com.venkates.InterviewQuestions;

public class Books {
	
	private String author;
	private int pub_year;
	private String language;
	
	
	public Books(String author, int pub_year, String language) {
		super();
		this.author = author;
		this.pub_year = pub_year;
		this.language = language;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPub_year() {
		return pub_year;
	}
	public void setPub_year(int pub_year) {
		this.pub_year = pub_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	

}
