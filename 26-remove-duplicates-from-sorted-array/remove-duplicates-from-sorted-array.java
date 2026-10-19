class Solution {
    public int removeDuplicates(int[] nums) {
        // yal
        int l = 1, r = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[r - 1] != nums[r]){
                nums[l] = nums[r];
                l++; 
            }
            r++;
        }
        return l;
    }
}