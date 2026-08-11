class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack( nums,new ArrayList<>(),visited, ans);
        return ans;
    }
    private void backtrack( int[] nums,List<Integer> processed, boolean[] visited,  List<List<Integer>> ans){
        if(processed.size() == nums.length){
            ans.add(new ArrayList<>(processed));
            return;
        }
        for(int i = 0; i<nums.length; i++){
           if(!visited[i]){
            processed.add(nums[i]);
            visited[i]= true;
            backtrack(nums,processed,visited,ans);
            processed.remove(processed.size()-1);
            visited[i] = false;
           }

        }
    }
    
        
    }
