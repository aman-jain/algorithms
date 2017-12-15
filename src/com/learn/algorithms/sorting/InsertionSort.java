package com.learn.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Input: A sequence of n numbers <a1,a2,a3,....an>
 * Output: A reordering of numbers <a`1, a`2,a`3...,a`n> such that a`1,a`2,a`3,...,a`n
 */
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Please enter the max numbers to sort");				
		Scanner reader = new Scanner(System.in);
		int sampleSize = reader.nextInt();		
		int[] sample = new int[sampleSize];
		System.out.println("Please enter the numbers to sort");
		for(int i =0;i<sampleSize;i++){
			sample[i] = reader.nextInt();
		}
		reader.close();
		int[] result = insertionSort(sample);
		System.out.println("First Method:"+Arrays.toString(result));
		
		int[] altResult = altInsertionSort(sample);
		System.out.println("Second Method:"+Arrays.toString(altResult));
		
		int[] compressedAltResult = altShortInsertionSort(sample);
		System.out.println("Compressed Insertion Sort:"+Arrays.toString(compressedAltResult));
		
	}
	
	private static int[] altInsertionSort(int[] sample){
		for(int i=1;i<sample.length;i++){
			for(int j=i;j>=0 && Util.less(sample[j],sample[j--]);j--){
				Util.exchange(sample, j, i);
			}
		}
		return sample;
	}
	
	private static int[] altShortInsertionSort(int[] sample){
		for(int i=1;i<sample.length;i++){
			int minIndex = -1;
			for(int j=i;j>=0;j--){
				if(j!=0 && Util.less(sample[j],sample[j--])){
					minIndex = j--;
					continue;
				}else if (minIndex != -1){
					Util.exchange(sample, minIndex, i);
				}
				
			}
		}
		return sample;
	}

	private static int[] insertionSort(int[] sample) {
		for(int j=1;j<sample.length;j++){
			int key = sample[j];
			int i=j-1;
			while (i >= 0 && sample[i] > key){
				sample[i+1] = sample[i];
				i--;
			}
			sample[i+1] = key;
		}
		return sample;
	}

}
