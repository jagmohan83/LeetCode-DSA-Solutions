class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
       // int[] dp = new int[n];
        //dp[0]=1;
        int[] tails = new int[n];
        int size = 0;
        int left = 0;
        int right = size;
        for(int num: nums){
            left =0;
            right= size;
            while(left<right){
                int mid = left + (right-left)/2;
                if(tails[mid]<num){
                    left = mid+1;
                }else{
                    right = mid;
                }
            }
            tails[left]=num;
            if(left==size){
                size++;
            }
        }
        return size;

        
    }
}