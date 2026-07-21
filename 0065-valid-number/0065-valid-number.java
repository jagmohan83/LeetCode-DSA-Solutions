class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExpo = false;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                seenDigit = true;
            }
            else if(ch=='+'||ch =='-'){
                if(i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1)!= 'E'){
                    return false;
                }
            }
            else if(ch =='.'){
                if(seenDot || seenExpo){
                    return false;
                }
                seenDot = true;
            }
            else if(ch =='e'||ch=='E'){
                if(seenExpo || !seenDigit){
                    return false;
                }
                seenExpo = true;
                seenDigit = false; 
            }
            else{
                return false;
            }

        }
        return seenDigit;
        
    }
}