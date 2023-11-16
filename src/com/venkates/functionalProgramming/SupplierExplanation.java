package com.venkates.functionalProgramming;

import java.util.function.Supplier;

public class SupplierExplanation {

	public static void main(String[] args) {
		Supplier<String> s=()->{
				String[] s1= {"Bunny" ,"Venkates" , "Tanvee" , "Karthik" , "Mom"};
				int x= (int) (Math.random()*3+1);
				return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
