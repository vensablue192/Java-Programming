package com.venkates.InterviewQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {
	public Map<String,Long> getBooksSorted(){
		
		List<Books> books=new BookDao().getBooks();
		
		// Count the number of books published on or after the year 2000 per language 
		Map<String,Long>  resMap=books.stream().filter(b->b.getPub_year() >= 2000).collect(Collectors.groupingBy(Books::getLanguage , Collectors.counting()));
		
		
		//Traditional style
		Map<String, Integer> resMapTraditional=new HashMap<String, Integer>();
		for(Books book: books) {
			if(book.getPub_year() >= 2000) {
				if(!resMapTraditional.containsKey(book.getLanguage()))
				resMapTraditional.put(book.getLanguage(), 1);
				else resMapTraditional.put(book.getLanguage(), resMapTraditional.get(book.getLanguage()) +1);
			}
			
		}
		
		System.out.println(resMapTraditional);
		
		return resMap;
			 
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