class Solution {
    public int findNumbers(int[] nums) {
        
        int numsWithEvenDigits = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int numOfDigits = (int) (Math.log10(nums[i]) + 1);
            if (numOfDigits % 2  == 0) {
                numsWithEvenDigits++;
            }
        }
        
        return numsWithEvenDigits;
    }
}