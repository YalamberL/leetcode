class Solution {
    public void moveZeroes(int[] nums) {
        // yal
        int l = 0;
        int r = 0;
        int n = nums.length;

        while (r < n){
            if(nums[r] != 0){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }

        while (l < n){
            nums[l] = 0;
            l++;
        }
    }
}