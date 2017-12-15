package com.learn.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
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
		System.out.println(Arrays.toString(altSort(sample)));
		
	}
	public static int[] sort(int[] a){
		int split = 1;
		while(split < a.length/3){
			split = split*3 + 1;
		}
		while(split>=1){
			for(int i=split; i<a.length; i++){
				for(int j =i;j>=split && Util.less(a[j],a[j-split]);j-=split){
					Util.exchange(a, j, j-split);
				}
			}
			split = split/3;
		}
		return a;   
	}
	public static int[] altSort(int[] a){
		int split = 1;
		while(split < a.length/3){
			split = split*3 + 1;
		}
		while(split>=1){
			for(int i=split; i<a.length; i++){
				int j= i;
				while(j<a.length){
					if(a[j]<a[j-i]){
						Util.exchange(a, j, j-i);
					}
					j++;
				}
			}
			split = split/3;
		}
		return a;   
	}
}
