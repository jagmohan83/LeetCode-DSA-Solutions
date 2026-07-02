class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high =0;
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int peaces = 1;
            int currentsum = 0;
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
        return ans;
    }
}