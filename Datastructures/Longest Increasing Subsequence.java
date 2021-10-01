class Solution {
    public static int lis(int []nums,int curr, int pre, int n, int[][] dp)
    {
        if(curr==n)
        {
            return 0;
        }
        if(dp[curr][pre+1]!=-1)
        {
            return dp[curr][pre+1];
        }
        int c1=0,c2=0;
        if(pre==-1 || nums[curr]>nums[pre])
        {
            c1=1+lis(nums,curr+1,curr,n,dp);
        }
        c2=lis(nums,curr+1,pre,n,dp);
         return dp[curr][pre+1]=Math.max(c1,c2);
    }
       public int lengthOfLIS(int[] nums) {
           
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];// two variable state  prevoius and current
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
         return lis(nums,0,-1,n,dp);
        
            
    }
}
