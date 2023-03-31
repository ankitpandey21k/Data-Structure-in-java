//A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
//Input format :
//The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
//Output format :
//Print the total possible number of ways.

package DP;

import java.util.Scanner;

public class Strair_case {

	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			System.out.print(stair_case(n));
		}

	}

	private static long stair_case(int n) {
		if(n<=1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		long dpCount[]=new long[n+1] ;
		dpCount[0]=1;
		dpCount[1]=1;
		dpCount[2]=2;
		
		for(int i=3;i<=n;i++) {
			dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];
		}
	
		return  dpCount[n];
	}

}
