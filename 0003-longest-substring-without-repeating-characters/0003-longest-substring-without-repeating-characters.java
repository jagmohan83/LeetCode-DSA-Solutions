class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int maxlen =0;
        int[] lastseen = new int[128];
        for(int i =0; i<128; i++){
            lastseen[i] = -1;
        }
        int left= 0;
        for(int right =0; right<n; right++){
            char currentchar = s.charAt(right);
            if(lastseen[currentchar]>=left){
                left = lastseen[currentchar]+1;
            }
            lastseen[currentchar]= right;
            if(maxlen<right-left+1){
        maxlen = right-left+1;
            }
        }
 return maxlen;
        }
       

    }
