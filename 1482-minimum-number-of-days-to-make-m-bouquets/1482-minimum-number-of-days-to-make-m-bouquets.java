class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 0;
        for(int day : bloomDay){
            high = Math.max(high,day);
        }
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int bouquets = 0;
            int adjustflower = 0;
            for(int day:bloomDay){
            if(day<=mid){
                adjustflower++;
                if(adjustflower ==k){
                    bouquets++;
                    adjustflower = 0;
                } 
            }else{
                adjustflower = 0;
            }
            }
            if(bouquets>=m){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}