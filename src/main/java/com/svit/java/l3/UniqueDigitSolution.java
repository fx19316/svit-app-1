package com.svit.java.l3;

public class UniqueDigitSolution {


	public int count(int n){// if 10 digits , then must duplicate, so it is same as the result with n == 10
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 10;
		}
		if(n > 10){
			n = 10;
		}
		int res = 10;
		for(int i = 2 ; i <= n ; i ++){
			res += 9 * A(i - 1);
		}
		return res;
	}
	
	private int A(int n){
		int res = 1;
		int i = 0;
		while(i < n){
			res *= (9 - i);
			i ++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueDigitSolution a = new UniqueDigitSolution();
		System.out.println(a.count(3));
	}

}
