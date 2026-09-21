class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int case1 = robRange(nums,1,n-1);
        int case2 = robRange(nums,0,n-2);
        return Math.max(case1,case2);
    }
    private int robRange(int[] nums, int start, int end){
        int n = nums.length;
        if(start==end){
            return nums[start];
        }
        int[] dp = new int[end-start+1];
        dp[0]= nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for(int i =2; i<=end-start; i++){
            dp[i]= Math.max(dp[i-1],dp[i-2]+nums[start+i]);
        }
        return dp[end-start];
    }
    
        
    }
