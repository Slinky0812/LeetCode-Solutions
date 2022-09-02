class MoveZeroes {
    public void moveZeroes(int[] nums) {
        
        int nonZeroPointer = 0;
        
        for(int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                int temp = nums[readPointer];
                nums[readPointer] = nums[nonZeroPointer];
                nums[nonZeroPointer] = temp;
                nonZeroPointer++;
            }
        }
        
        
    }
}