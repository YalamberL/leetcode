class Solution {
    public int maxArea(int[] height) {
        
        int max_water = 0; 
        int left = 0;
        int right = height.length - 1;
        while (left <= right){
            if (height[left] < height[right]){
                int water_height = height[left] * (right - left);
                max_water = Math.max(water_height, max_water);
                left++;
            } else {
                int water_height = height[right] * (right - left);
                max_water = Math.max(water_height, max_water);
                right--;
            }
        }
        return max_water;
    }
}