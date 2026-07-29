class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maximum = 0;

        while(low < high){
            int area = (high - low) * Math.min(height[high],height[low]); // Main formula to Calculate area (Backbone of this code)
            maximum = Math.max(maximum,area);

            if(height[low] <= height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maximum;
    }
}