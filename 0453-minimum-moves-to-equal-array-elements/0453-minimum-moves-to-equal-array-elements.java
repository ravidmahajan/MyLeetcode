class Solution {
    public int minMoves(int[] nums) {
      Arrays.sort(nums);
        int minMoves = 0;
        for(int i=nums.length-1 ; i>0 ;i--){
            minMoves = minMoves + (nums[i] - nums[0]);
        }
        return minMoves;
    }
}