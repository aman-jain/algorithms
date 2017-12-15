package com.learn.algorithms.sorting;
import java.util.Arrays;
import java.util.Scanner;

import com.learn.algorithms.sorting.Util;
public class SelectionSort {
	public static void main(String[] args){
		System.out.println("Please enter the max numbers to sort");				
		Scanner reader = new Scanner(System.in);
		int sampleSize = reader.nextInt();		
		int[] sample = new int[sampleSize];
		System.out.println("Please enter the numbers to sort");
		for(int i =0;i<sampleSize;i++){
			sample[i] = reader.nextInt();
		}
		reader.close();
		System.out.println(Arrays.toString(sort(sample)));
		
	}
   public static int[] sort(int[] a){
	   
	   for(int i=0;i<a.length;i++){
		   int min = i;
		   for(int j= i+1;j<a.length;j++){
			   if(a[j]<a[min]){
				   min = j;
			   }
		   }
		   a = Util.exchange(a, i, min);
		   
	   }
	   return a;
	   
   }
}
