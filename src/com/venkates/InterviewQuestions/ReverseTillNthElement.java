package com.venkates.InterviewQuestions;

import java.util.Arrays;

public class ReverseTillNthElement {

	public static void main(String[] args) {
		int[] a= {4,6,7,21,9,12,14};
		int n=4;
		System.out.println(Arrays.toString(reverseTillNthElement(a, n)));
	}
	
	public static int[] reverseTillNthElement(int[] a,int n) {
		int startIdx=0;
		int endIdx=n-1;
		int temp=0;
		
		while(startIdx < endIdx) {
			temp=a[startIdx];
			a[startIdx]=a[endIdx];
			a[endIdx] = temp;
			startIdx++;
			endIdx--;
		}
		
		
		return a;
	}

}
