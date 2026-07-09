class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        String sSorted = new String(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        String tSorted = new String(tArr);
        if(sSorted.equals(tSorted)){
            return true;
        }else {
            return false;
        }
        
    }
}