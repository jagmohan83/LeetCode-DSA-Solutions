
class Solution {
      private static final String[] MAP = {
        "",    
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv", 
        "wxyz"  
    };
    public List<String> letterCombinations(String digits) {
      
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()){
            return ans;
        }
        helper("", digits, ans);
    return ans;
    }
    private void helper(String p, String up,  List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        String letters = MAP[digit];
        for(char ch : letters.toCharArray()){
            helper(p+ch,up.substring(1),ans);
        }
    }
        
    }
