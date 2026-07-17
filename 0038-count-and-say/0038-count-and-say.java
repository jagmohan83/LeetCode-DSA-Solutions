class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String prev = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i<prev.length()){
            char currentchar = prev.charAt(i);
            int count = 0;
            while(i<prev.length() && prev.charAt(i)==currentchar){
                count++;
                i++;
            }
            result.append(count);
            result.append(currentchar);

        }
        return result.toString();
        
    }
}