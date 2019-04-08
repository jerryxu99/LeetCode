public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int shift = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                shift++;
            } else if (shift > 0) {
                nums[i - shift] = nums[i];
            }
        }
        return nums.length - shift;
    }
}
