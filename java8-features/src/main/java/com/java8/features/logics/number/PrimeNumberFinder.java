/**
 * 
 */
package com.java8.features.logics.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aravinth
 *
 */
public class PrimeNumberFinder {
	
	public static boolean isPrimeNumber(int number) {
		if(number > 1) {
			for(int i=2; i<number; i++) {
				if(number%i == 0) {
					return false;
				}					
			}
		}
		return true;
	}
	
	public static List<Integer> findInRange(int start, int end){
		List<Integer> primeNumberList = new ArrayList<>();
		if(start > 1 && end > 1) {
			for(int i=start;i<=end;i++) {
				if(isPrimeNumber(i)) {
					primeNumberList.add(i);
				}
			}
		}
		if(primeNumberList.size() == 0) {
			return null;
		}
		return primeNumberList;		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(11));
		System.out.println(findInRange(10, 25));
	}

}
