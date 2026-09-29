class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total =0;
        for(int num : nums){
            total += num;
        }
        if(Math.abs(target)>total){
            return 0;
        }
        int totalTarget = target + total;

        if(totalTarget %2 !=0){
            return 0;
        }
        int offset =total;
        int[][] dp = new int[n+1][2*total+1];
        dp[0][offset] = 1;
        for(int i= 0; i<n; i++){
            for(int sum = 0; sum<2*total+1; sum++){
                if(dp[i][sum] != 0){
                    if(sum-nums[i]>=0){
                        dp[i+1][sum-nums[i]] += dp[i][sum];

                    }
                        dp[i+1][sum+nums[i]] += dp[i][sum];

                }
            }
        }
        return dp[n][offset+target];

        
    }
}