class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength = 0;
        int zerocount =0;
        int left =0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            if(right-left+1>maxlength){
                maxlength = right-left+1;
            }
        }
        return maxlength;
    }
}