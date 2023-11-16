package com.venkates.functionalProgramming.Lambda_Impl_Example;

import java.util.Collections;
import java.util.List;

public class BookService2 {
	public List<Book> getBooksSorted(){
	
	List<Book> books =new BookDao().getBooks();
	Collections.sort(books, (b1,b2) -> b1.getName().compareTo(b2.getName()));
	return books;
}
	
	public static void main(String[] args) {
		System.out.println(new BookService2().getBooksSorted());
	}
}

