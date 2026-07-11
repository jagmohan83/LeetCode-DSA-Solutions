class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

       
        for (int num : set) {
           
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

               
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLen += 1;
                }

                
                if(maxLen<currentLen){
                    maxLen = currentLen;
                }
            }
        }

        return maxLen;
    }
}