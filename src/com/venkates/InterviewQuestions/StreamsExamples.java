package com.venkates.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {
	
	public static void main(String[] args) {
		
		/* Input : List<String> l1=["a","b","c","d"], List<String> l2= ["c","d","e","f"]
		 * Output: List<String> result=["A","B","C","D","E","F"]
		 */
			
		List<String> lis1=Arrays.asList("a","b","c","d");
		List<String> lis2=Arrays.asList("c","d","e","f");
		List<String> mlis=new ArrayList<String>();
		mlis.addAll(lis1);
		mlis.addAll(lis2);
		
		mlis.stream().distinct().map(s->s.toUpperCase()).forEach(t->System.out.println(t));
		/* print the distinct array elements - If we input an array with elements 1, 2,
		 * 2, 3, 4, 5 it would print the result as 1,2,3,4,5.
		 */
				
		int[] arr= {1, 2, 2, 3, 4, 5};
		Arrays.stream(arr).distinct().forEach(t->System.out.println(t));
		
		// different way
		int[] distinctList = Arrays.stream(arr).distinct().toArray();
		System.out.println(distinctList);
		
		// Print the strings starting with "b"
		List<String> list1= Arrays.asList("Sachin","Venkates","bumrah","kohli","Pujara" , "bhuvaneshwar");
		list1.stream().filter(s->s.startsWith("b")).forEach(s->System.out.println(s));
		
		// Print the keys in a map which are even numbers
		Map<Integer, String> mbasic=new HashMap<Integer, String>();
		mbasic.put(1, "a");
		mbasic.put(2, "b");
		mbasic.put(3, "c");
		mbasic.put(4, "d");
		mbasic.entrySet().stream().filter(k->k.getKey()%2==0).forEach(t->System.out.println(t.getKey()));
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Sachin",100,10000,"SE")); 
		l.add(new Employee("Kohli",101,20000, "SSSE"));
		l.add(new Employee("Dravid",102 , 30000,"CS"));
		l.add(new Employee("Srinath",103 , 40000, "SE"));
		l.add(new Employee("Bumrah",104 , 500000 , "LCS"));
		l.add(new Employee("Shami",105, 30000, "SE"));
		
		// Find the average salary in each department
		Map<String,Double> avgSalDept=l.stream().collect(Collectors.groupingBy(Employee::getDesignation , Collectors.averagingInt(Employee::getSalary)));
		System.out.println("Average salary for designations -- >"+avgSalDept);
		
		// List of distinct roles
		List<String> distinctdesignationList = l.stream().map(Employee::getDesignation).distinct().collect(Collectors.toList());
		System.out.println("distinct designation List ---- > "+ distinctdesignationList);
		
		/*-Filter the employees whose salary is greater than 10000 and designation is  software Engineer. 
		 * Use the result data to add 10000 salary to each employee from the filtered data
		 */
		List<Integer> custList  = l.stream().filter(sal -> sal.salary > 10000 && sal.designation == "SE").map(e-> e.salary+10000).collect(Collectors.toList());
		System.out.println("custList"+custList);
		
		 // Print the first duplicate number
		 List<Integer> itemsList = Arrays.asList(10, 14, 126, 12, 126, 40, 61, 61);
	      
		 Optional<Integer> fisrtdup= itemsList.stream().filter(e -> Collections.frequency(itemsList, e) > 1).findFirst();
	     System.out.println(fisrtdup);
		
		// Count the no of employees with same designation or same department
		Map<String, Long> noEmployeesHavingDesigation = l.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
		System.out.println("No Of employees with same designation -- >"+noEmployeesHavingDesigation);
	
		//Count the empty elements in a list
		List<String> l3=Arrays.asList("a","","b","");
		Long count=l3.stream().filter(s -> s.isBlank()).count();
		System.out.println("Count of empty strings in a list  -- > " + count);
		
		//Count the no of characters in a given string
		String input = "gainjavaknowledge";
		Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		// print the duplicate charachters
		String input1 = "gainjavaknowledge";
		List<String> dupicateChars = Arrays.stream(input1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(dupicateChars);
		
		
		// print the unique charachters
		String input2 = "pleasegainjavaknowledge";
		List<String> uniqueChars=Arrays.stream(input2.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue() ==1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(uniqueChars);
		
		
		// Print the first non repeating element for a given string
		String input3 = "pleasegainjavaknowledge";
		String firstNonRepeatingCharachter = Arrays.stream(input3.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		    	.entrySet().stream().filter(x-> x.getValue() == 1).findFirst().get().getKey();
		
		System.out.println(" First non repeating character from the given string-->"+ firstNonRepeatingCharachter );
	
		// Print the first repeating element for a given string
		String input4 = "pleasegainjavaknowledge";
		
		String firstRepeatingCharachter = Arrays.stream(input4.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
											.entrySet().stream().filter(x->x.getValue() > 1).findFirst().get().getKey();
		
		System.out.println("First Repeating Character from the given string -->"+firstRepeatingCharachter);
		
		// Print the second highest number from a given array
		int[] in1= {4,6,8,9,2,3};
		Optional<Integer> secondHighest = Arrays.stream(in1).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst();
		System.out.println("Second highest --> "+ secondHighest);
		
		// Print the second lowest number from a given array
		int[] in2= {4,6,8,9,2,3};
		Optional<Integer> secondLowest = Arrays.stream(in2).boxed().sorted().skip(1).findFirst();
		System.out.println("Second lowest --> "+ secondLowest);
		
		// Find the longest string in a given array
		String[] strArray= {"Java" , "techie" , "springboot" , "microservices"};
		String longestString = Arrays.stream(strArray).reduce((word1,word2)-> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(longestString);
		
		//Split the below string and put it into a map	
		String str = "Venkata:20;Test:30";
		Map<String,String> splitAddToMap=Arrays.stream(str.split(";")).map(s -> s.split(":", 2)).collect(Collectors.toMap(a -> a[0], a -> a.length > 1 ? a[1] : ""));
		System.out.println(splitAddToMap);
		
		//Print elements starting with 1
		int[] numArr= {5,9,11,2,8,21,1};
		List<String> numbersStartingWithOne=Arrays.stream(numArr).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println("Numbers starting with one"+numbersStartingWithOne);
		
		/*Remove unwanted chars Given an array [“123f”, “1dsa12”, “1212ds”, “65fd”,  “sadfa”, “asdasd”]
		 * Sum of all the numbers after removing all the unwanted characters - 123+112+1212+65  */		
		
		String[] strArr= {"123f", "1dsa12", "1212ds", "65fd",  "sadfa", "asdasd"};
		int cnt = Arrays.stream(strArr).map(s->s.replaceAll("[^0-9]","")).filter(s-> !s.isEmpty()).mapToInt(s-> Integer.parseInt(s)).reduce(0, (a,b) -> a+b);
		System.out.println("Count of numbers from the string array after removing characters -->  "+cnt);	
		
		// String.join method example
		List<String> nos= Arrays.asList("1","2","3","4");
		//1-2-3-4   -- > print this pattern
		String res=String.join("-", nos);
		System.out.println("String.join() usage -- > "+res);
		
		// Skip & Limit  -- > example -- (2 - 9) 
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
		
		//Reverse the string
		String strRev="Venkatesreddy";
				
		String reversed = strRev.chars()
					    .collect(StringBuilder::new,
					             (b, c) -> b.insert(0, (char)c), (b1, b2) -> b1.insert(0, b2))
					    .toString();
				
		String reversed1 = Stream.of(strRev)
		                .map(word->new StringBuilder(word).reverse())
		                .collect(Collectors.joining(" "));
				
		String reversed2 = IntStream.range(0, strRev.length())
		        .map(i -> strRev.charAt(strRev.length() - i - 1))
		        .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
		        .toString();
				System.out.println(reversed2);
	}
}

class Employee{
	
	String name;
	int id;
	int salary;
	String designation;
	
	public Employee(String name, int id, int salary, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	
	
}