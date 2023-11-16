package com.venkates.functionalProgramming.Lambda_Impl_Example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks(){
	List<Book> books = new ArrayList<>();
	books.add(new Book(101,"Java",400));
	books.add(new Book(101,"React",400));
	books.add(new Book(101,"AWS",400));
	books.add(new Book(101,"MicroServices",400));
	
	return books;
	}
}
