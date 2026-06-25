class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentsum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int right = 0; right<nums.length;right++){
            currentsum +=nums[right];
            while(currentsum>=target){
                int currentwindow = right-left+1;
                if(minlen>currentwindow){
                    minlen = currentwindow;
                }
                currentsum -= nums[left];
                left++;
            }
           
        }
        if (minlen == Integer.MAX_VALUE) {
    return 0;
} else {
    return minlen;
}
    }
}