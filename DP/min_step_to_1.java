package DP;

import java.util.Scanner;

public class min_step_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scn=new Scanner(System.in);
	 int n=scn.nextInt();
	  
	  System.out.print(countStepstoOne(n));
	}
	public static int countStepstoOne(int n) {
		// TODO Auto-generated method stub
		if(n==0|| n==1) {
			return 0;
		}
		else if(n==2 || n==3) {
			return 1;
		}
		int[] dp=new int[n+1];
//		for(int i=0;i<=3;i++) 
			 dp[0]=-1;
			 dp[1]=0;
			 dp[2]=1;
			 dp[3]=1;
			 
		for(int i=4;i<=n;i++) {
			int ans1=dp[i-1];
			int ans2=Integer.MAX_VALUE;
			int ans3=Integer.MAX_VALUE;
			
			if(i%2==0) {
				ans2=dp[i/2];
			}
			else if(i%3==0) {
			ans3=dp[i/3];
			}
		
			dp[i]=Math.min(ans1, Math.min(ans2, ans3))+1;
		}
		return dp[n];
	}

}
