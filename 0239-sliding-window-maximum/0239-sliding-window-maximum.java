class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int ri =0;
        int[] customQueue = new int[n];
        int head = 0; 
        int tail = 0; 
        
        for (int i = 0; i < n; i++) {
           
            if (head < tail && customQueue[head] < i - k + 1) {
                head++; 
            }
            
           
            while (head < tail && nums[customQueue[tail - 1]] < nums[i]) {
                tail--; 
            }
            
           
            customQueue[tail++] = i;
            
            
            if (i >= k - 1) {
                result[ri++] = nums[customQueue[head]];
            }
        }
        
        return result;
    }
}