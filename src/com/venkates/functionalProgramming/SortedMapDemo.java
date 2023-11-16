package com.venkates.functionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mpdem=new HashMap<String, Integer>();
		mpdem.put("eight", 8); 
		mpdem.put("four", 4);
		mpdem.put("ten", 10);
		mpdem.put("two", 2);
		
		//List<Entry<String,Integer>> entries=new ArrayList<>(mpdem.entrySet());
		//Collections.sort(entries, (kv1, kv2) ->  kv1.getKey().compareTo(kv2.getKey()));
		
		mpdem.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("-------------");
		mpdem.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		Map<Employee , Integer> empMap = new TreeMap<Employee, Integer>();
		empMap.put(new Employee(176, "Roshan" , "IT" , 600000), 60);
		empMap.put(new Employee(388, "Bikash" , "Civil" , 900000), 90);
		empMap.put(new Employee(470, "Bimal" , "Defence" , 500000), 50);
		empMap.put(new Employee(624, "Sourav" , "Core" , 400000), 40);
		empMap.put(new Employee(284, "Prakash" , "Social" , 1200000), 120);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
				
	}

}
