class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstin = -1;
        int lastin =-1;
        int left = 0;
        int right= nums.length-1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(target == nums[mid]){
                firstin = mid;
                right = mid - 1;
            }else if(target<nums[mid]){
                 right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        left = 0;
        right = nums.length-1;
        lastin = -1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(target == nums[mid]){
                lastin= mid;
                left = mid + 1;
            }else if(target<nums[mid]){
                 right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return new int[]{firstin,lastin};
    }
}