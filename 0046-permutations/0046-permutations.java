class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans);
        return ans;
    }
    private void backtrack(int index, int[] nums, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> current = new ArrayList<>();
            for(int num : nums){
                current.add(num);

            }
            ans.add(current);
            return;

        }
        for(int i = index; i<nums.length; i++){
            swap(index,i,nums);
            backtrack(index+1 , nums,ans);
            swap(index, i, nums);

        }
    }
    private void swap(int j, int i , int[] nums){
        int temp = nums[j];
        nums[j]= nums[i];
        nums[i] = temp;
    }
        
    }
