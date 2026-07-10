class Solution {
    public int myAtoi(String s) {
if (s == null || s.length() == 0){
    return 0;
}
        long ans = 0;
        int i = 0;
        int n = s.length();
        int sign = 1;
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        while(i<n && (s.charAt(i)>='0' && s.charAt(i) <='9')){
            int digit = s.charAt(i)-'0';
            ans = ans * 10 +digit;

            if (sign == 1 && ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            } 
            if (sign == -1 && -ans < Integer.MIN_VALUE){
                 return Integer.MIN_VALUE;
            } 
            i++;
        }
        return (int) (ans * sign);
    }
}