package com.venkates.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheFirstDuplicateUsingStreams {

		   public static void main(String []args) {
		      // create a list with duplicate items
		      List<Integer> itemsList = Arrays.asList(10, 14, 126, 12, 126, 40, 61, 61);
		      
		      List<Integer> dupList= itemsList.stream().filter(e -> Collections.frequency(itemsList, e) > 1).collect(Collectors.toList());
		      
		      System.out.println(dupList.get(0));
		      
		    
		   }

}
