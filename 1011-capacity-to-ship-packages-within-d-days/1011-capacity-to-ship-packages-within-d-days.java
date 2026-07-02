class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high = 0;
        for(int w :weights){
            if(low<w){
                low = w;
            }
            high += w;
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
           int currentweightonship = 0;
           int currentdaysship = 1;
            for (int i = 0; i < weights.length; i++) {
             int w = weights[i];
              if (currentweightonship + w > mid) {
              currentdaysship++;
             currentweightonship = w;
            } else {
                currentweightonship += w;
             }
        }
            if(currentdaysship <=days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}