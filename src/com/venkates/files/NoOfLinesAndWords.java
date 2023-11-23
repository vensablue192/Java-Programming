package com.venkates.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoOfLinesAndWords {

	public static void main(String[] args) throws FileNotFoundException {
		int countLines=0;
		int countWords=0;
		String line;
		
		File file=new File("/home/challa/Desktop/testfile");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
		
			
			line =sc.nextLine();
			String words[] = line.split("");
			countWords+=words.length;
			countLines++;
		}
		
		
		System.out.println("Count Lines.."+countLines);
		System.out.println("Count Words.."+countWords);

	}

}
