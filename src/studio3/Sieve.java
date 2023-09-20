package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = in.nextInt();
		
		boolean [] numberlist = new boolean [n];
		
		for(int i = 0; i< numberlist.length; i++) {
			numberlist[i] = true;
		}
		for(int outer=2; outer<=numberlist.length;outer++) {
			for(int i = (outer + outer); i < numberlist.length; i+=outer) {
				numberlist[i] = false;	
			}
		}
		for(int printer=0; printer<=numberlist.length-1; printer++) {
			if(numberlist[printer]==true) {
			System.out.println("This is where you are "+printer);
			}
		}
		
	
		
	}

}
