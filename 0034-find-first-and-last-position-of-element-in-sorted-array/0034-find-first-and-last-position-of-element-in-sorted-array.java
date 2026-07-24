class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true); 
        ans[1] = search(nums, target, false);  

        return ans; 
    }
    public static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < nums[mid]) {
                e = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                // Target found
                ans = mid;

                if (findStart) {
                    e = mid - 1;   // Continue searching left
                } else {
                    s = mid + 1;   // Continue searching right
                }
            }
        }
        return ans;
    }
}