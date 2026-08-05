class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(), ans);
        return ans;

    }
    private void backtrack(int start, int k, int n,  List<Integer> current, List<List<Integer>> ans){
        if(n==0 && current.size()  ==k){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(current.size()>k || n<0){
            return;
        }
        for(int i = start; i<=9; i++){
            if(i>n){
                break;
            }
            current.add(i);
            backtrack(i+1,k, n-i,current,ans);
            current.remove(current.size()-1);

        }
    }
}