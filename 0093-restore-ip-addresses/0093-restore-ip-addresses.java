class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();

        // Quick Pruning: Minimum 4 digits and Maximum 12 digits valid hote hain
        if (s.length() < 4 || s.length() > 12) {
            return ans;
        }

        backtrack(0, 0, s, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(int index, int dots, String s, StringBuilder current, List<String> ans) {
       
        if (dots == 4) {

            if (index == s.length()) {
                
                ans.add(current.substring(0, current.length() - 1));
            }
            return;
        }

       
        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break; // String ke bahar nahi jana

            String part = s.substring(index, index + len);

           
            if (part.length() > 1 && part.charAt(0) == '0') break;

            
            int val = Integer.parseInt(part);
            if (val > 255) break;

          
            int prevLen = current.length();
            current.append(part).append(".");

           
            backtrack(index + len, dots + 1, s, current, ans);

           
            current.setLength(prevLen);
        }
        
    }
}