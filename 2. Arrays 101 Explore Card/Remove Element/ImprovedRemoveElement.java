class ImprovedRemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int valPointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != val) {
                int temp = nums[readPointer];
                nums[readPointer] = nums[valPointer];
                nums[valPointer] = temp;
                valPointer++;
            }
        }
        
        return valPointer;
    }
}