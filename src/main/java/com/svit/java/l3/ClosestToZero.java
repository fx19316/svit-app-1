package com.svit.java.l3;

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
		int a[] = {1,2,3,-1,4};
		ClosestToZero b = new ClosestToZero();
		System.out.println(b.minDiff(a));
	}

}
