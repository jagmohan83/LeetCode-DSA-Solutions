class Solution {
    public int splitArray(int[] nums, int k) {
        long low=0;
        long high =0;
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        long ans = high;
        while(low<=high){
            long mid = low+(high-low)/2;
            int peaces = 1;
            long currentsum = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]+currentsum>mid){
                    peaces++;
                    currentsum = nums[i];
                }else {
                    currentsum += nums[i];
                }
            }
             if(peaces <= k){
                ans = mid;
                high = mid-1;
             }else{
                low = mid+1;
             } 
        }
        return (int) ans;
    }
}