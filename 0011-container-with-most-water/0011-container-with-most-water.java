class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int currentarea =0;
        int maxarea = 0;
        while(left<right){
            int width = right-left;
            int currentHeight = Math.min(height[left], height[right]);
            currentarea= currentHeight*width;
            maxarea = Math.max(maxarea,currentarea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

            }
            return maxarea;
        }
        
    }
