class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
public class removeDuplicate {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 2};
        int length = s.removeDuplicates(nums);
        System.out.println(length);
    }
    
}
