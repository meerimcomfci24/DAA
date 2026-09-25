public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
          
            low = (nums[mid] < target) ? mid + 1 : low;
            high = (nums[mid] > target) ? mid - 1 : high;
        }
        
        return -1;
    }
}
