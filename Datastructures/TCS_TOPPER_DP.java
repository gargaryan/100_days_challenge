/*
A motorsports car race is held from source A to destination B. There are 'N' number of halts en route A to B. The racer can skip a halt or at a halt. Each time he stops or skips a it costs him some amount of time, as per the array (a[i]), 0<i<=N-1. The task here is to find the minimum amount of time it takes for the racer to reach the destination based off

the following conditions: • The racer can skip a maximum of two consecutive halts.

• Each time a racer stops at a halt i, him time equal to a[i]. 5982 the r racer skips a halt i, it16 1 i, it costs

osts him time given Y. to Minimum(a[i], Y), for •The racer cannot skip the first and the last

halts.

Input:

5 -> Value of N
6 ->Value of Y
cost[]={5,1,4,7,3}


Output:

19

input 2:

6 -> value of N
4 ->Value of Y

cost[]={1,2,4,6,5,3}
Output:
18
*/

import java.util.*;
public class Main
{
    static  int maximumtime(int n, int  cost[],int  y,int ans, int c,int []dp)
    {
      if(n==0)
      {
          return ans+cost[0];
      } 
      int c1=Integer.MAX_VALUE, c2=Integer.MAX_VALUE;
      if(dp[n]!=-1)
      {
          return dp[n];
      }
      
      if(c<2)
      {
          c1=maximumtime(n-1,cost,y,ans+Math.min(cost[n],y),c+1,dp);
      }
      c2=maximumtime(n-1,cost,y,ans+cost[n],c,dp);
      return  dp[n]=Math.min(c1,c2);
    }
         
	
    public static void main(String[] args)
    {
        int n=6;
        int y=4;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int cost[]={1,2,4,6,5,3};
        System.out.println(maximumtime(n-2,cost,y,cost[n-1],0,dp));
    }

		
	
}
