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
       // int[] dp = new int[end-start+1];
       int prev2= nums[start];
        int prev1 = Math.max(nums[start], nums[start+1]);
        for(int i =2; i<=end-start; i++){
            int current= Math.max(prev1,prev2+nums[start+i]);
            prev2= prev1;
            prev1=current;
        }
        return prev1;
    }
    
        
    }
