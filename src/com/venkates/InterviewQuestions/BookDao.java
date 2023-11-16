package com.venkates.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Books> getBooks(){
	List<Books> books = new ArrayList<>();
	books.add(new Books("Venkates",2000,"Telugu"));
	books.add(new Books("Venkates",1998,"English"));
	books.add(new Books("Sachin", 1998,"Telugu"));
	books.add(new Books("Sharma", 2000, "Kannada"));
	books.add(new Books("Venkates",2000,"Telugu"));
	books.add(new Books("Venkates",1998,"English"));
	books.add(new Books("Sachin", 1998,"Telugu"));
	books.add(new Books("Sharma", 2000, "Kannada"));
	
	return books;
	}
}
