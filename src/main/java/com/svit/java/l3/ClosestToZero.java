package com.svit.java.l3;

import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClosestToZero {

	public int minDiff(int[] a){//return index
		int min = Integer.MAX_VALUE;
		int res = -1;
		for(int i = 0 ; i < a.length ; i ++){
			if(Math.abs(a[i]) < min){
				min = Math.abs(a[i]);
				res = i;
			}
			else if(Math.abs(a[i]) == min){
				res = a[i] > a[res] ? i : res;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1 ; 
		int b = 2;
		swap(a , b);
		System.out.println(a);
	}
	public static void swap(int a , int b){
		int t = a; 
		a = b ; 
		b = t;
	}

}
