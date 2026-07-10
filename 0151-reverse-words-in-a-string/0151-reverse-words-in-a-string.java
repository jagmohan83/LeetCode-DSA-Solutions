class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i = n-1; i >=0; i--){
            if(s.charAt(i)==' '){
                continue;
            }
        
        int end = i;
        while(i>=0 && s.charAt(i) !=' '){
            i--;
        }
        
        if(ans.length()>0){
            ans.append(" ");
        }
        ans.append(s.substring(i+1, end+1));
        }
        return ans.toString();
    }
    
}