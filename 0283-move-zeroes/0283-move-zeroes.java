class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;

        int temp = 0;
        while(left<n){
            if(nums[left] != 0){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            right++;


            }else{
                left++;
            }

            
        }
        return ;
        
    }
}