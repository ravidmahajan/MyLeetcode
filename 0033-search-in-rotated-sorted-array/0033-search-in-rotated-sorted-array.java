class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;  // prevent integer overflow
            if(nums[mid] == target){
                return mid;
            }
            //check if left side is sorted
            if( nums[low] <= nums[mid]){
            //check if target lies in this side
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // right side sorted
            else {
                //check if target lies in this side
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                } 
            }
        }
        return -1;
    }
}