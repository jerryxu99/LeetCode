public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[counter]) {
                counter++;
                nums[counter] = nums[i];
            }
        }
        return counter + 1;
    }
}
