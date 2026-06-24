class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
       double maxsum = Integer.MIN_VALUE; // Ya fir pehli window ka sum nikalne ke baad assign karna
       int currentsum =0;
       if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
        return 0.0;
    }
       for(int i =0; i<nums.length; i++){
        currentsum += nums[i];
        
       if(i>=k){
        currentsum -=nums[i-k];
       }
       if(i>=k-1){
        maxsum = Math.max(maxsum,currentsum);
       }
       
    }
    return (double) maxsum/k;
    }
}