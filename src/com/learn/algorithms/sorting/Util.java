package com.learn.algorithms.sorting;

public class Util {
	Comparable<?>[] a;
	Util(Comparable<?>[] a){
		this.a = a;
	}
	
	public static Comparable<?>[] exchange(Comparable<?>[] a, int min, int i){
		Comparable<?> t = a[i];
		a[i] = a[min];
		a[min] = t;
		return a;
	}
	
	public static int[] exchange(int[] a, int min, int i){
		int t = a[i];
		a[i] = a[min];
		a[min] = t;
		return a;
	}
	public static  boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
}
