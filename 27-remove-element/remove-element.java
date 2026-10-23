class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[r] != val){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }

        return l;
    }
}