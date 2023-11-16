package com.venkates.functionalProgramming.Lambda_Impl_Example;

import java.util.Collections;
import java.util.List;

public class BookService {
	public List<Book> getBooksSorted(){
		
		List<Book> books=new BookDao().getBooks();
			
		Collections.sort(books, (b1,b2) -> b1.getName().compareTo(b2.getName())); 
		
		return books;
			 
}
	
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBooksSorted());
	}
}



/*-
  class MyComparator implements Comparator<Book>{
  
  @Override
  public int compare(Book b1, Book b2) {
  
  return b1.getName().compareTo(b2.getName()); 
  }
  
  }
 */