class SortArray {
    public int[] sortArrayByParity(int[] nums) {
        
        int evenNums = 0;
        
        for (int pointer = 0; pointer < nums.length; pointer++) {
            if (nums[pointer] % 2 == 0) {
                int temp = nums[evenNums];
                nums[evenNums] = nums[pointer];
                nums[pointer] = temp;
                evenNums++;
            }
        }
        
        return nums;
    }
}