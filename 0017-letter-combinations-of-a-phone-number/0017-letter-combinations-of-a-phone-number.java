class Solution {
      public List<String> letterCombinations(String digits) {
        String[] map = {
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
      
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()){
            return ans;
        }
        helper(0, digits,map, new StringBuilder(), ans);
    return ans;
    }
    private void helper(int index, String digits,String[] map, StringBuilder p, List<String> ans){
       if (index == digits.length()) {
            ans.add(p.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = map[digit];
        for(int i =0; i<letters.length(); i++){
            p.append(letters.charAt(i)); 
            
            helper(index + 1, digits,map, p, ans); 
            
            p.deleteCharAt(p.length() - 1);
        }
    }
        
    }
