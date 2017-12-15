package com.learn.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	
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
		int[] result = mergeSort(sample);
		System.out.println(Arrays.toString(result));
	}
	public static int[] mergeSort(int[] sample){
		if (sample.length > 1){
			int length = sample.length;
			int mid = length/2;
			int[] array1 = new int[mid];
			int[] array2;
			if((sample.length % 2) == 1){
				array2 = new int[mid+1];
			}else{
				array2 = new int[mid];
			}
			for(int i=0;i<array1.length;i++){
				array1[i] = sample[i];
			}
			for(int i=0;i<array2.length;i++){
				int j = i + mid;
				array2[i] = sample[j];
			}
			
			array1 = mergeSort(array1);
			array2 = mergeSort(array2);
			
			int[] resultArray = new int[length];
			
			int i=0,j=0,k=0;
			
			while(j!=array1.length && k!=array2.length){
				if(array1[j] < array2[k]){
					resultArray[i] = array1[j];
					i++;
					j++;
				}else{
					resultArray[i] = array2[k];
					i++;
					k++;
				}
				
			}
			while(array1.length != j)
			{
				resultArray[i] = array1[j];
				i++;
				j++;
			}
			while(array2.length != k)
			{
				resultArray[i] = array2[k];
				i++;
				k++;
			}
			return resultArray;
		}
		return sample;
		
	}
}
