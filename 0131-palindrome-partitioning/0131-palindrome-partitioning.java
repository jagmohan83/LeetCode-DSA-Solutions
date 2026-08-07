class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(0,s,new ArrayList<>(), ans);
        return ans;
        
    }
    private void backtrack(int start, String s, List<String> current, List<List<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i =start; i<s.length(); i++){
            if(isPalindrome(s,start,i)){
                current.add(s.substring(start,i+1));
                backtrack(i+1,s,current,ans);
                current.remove(current.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s, int low, int high){
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}