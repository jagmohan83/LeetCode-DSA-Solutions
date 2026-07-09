class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int currentsum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i<nums.length;i++){
            currentsum += nums[i];
            if(map.containsKey(currentsum-k)){
                count += map.get(currentsum-k);
            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        }
        return count;
    }
}