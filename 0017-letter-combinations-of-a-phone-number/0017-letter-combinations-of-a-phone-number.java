
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
        helper(0, digits, new StringBuilder(), ans);
    return ans;
    }
    private void helper(int index, String digits, StringBuilder p, List<String> ans){
       if (index == digits.length()) {
            ans.add(p.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = MAP[digit];
        for(char ch : letters.toCharArray()){
            p.append(ch); 
            
            helper(index + 1, digits, p, ans); 
            
            p.deleteCharAt(p.length() - 1);
        }
    }
        
    }
