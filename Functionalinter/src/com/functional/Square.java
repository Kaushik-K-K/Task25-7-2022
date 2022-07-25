package com.functional;

public class Square {
	public static void main(String[] args) {
		SquareRoot squareroot = (n) -> (Math.sqrt(n)); 
		System.out.println(squareroot.findSquareRoot(100));
	}

}
