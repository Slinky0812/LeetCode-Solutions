class SortedSquareArray {
    public int[] sortedSquares(int[] nums) {
        
        int[] squaredNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squaredNums[i] = (int) Math.pow(nums[i], 2);
        }
                
        for (int i = 1; i < squaredNums.length; i++) {
            
            int value = squaredNums[i];
            int j = i - 1;
            while (j >= 0 && value < squaredNums[j]) {
                squaredNums[j + 1] = squaredNums[j];
                j--;
            }
            squaredNums[j + 1] = value;
        }
        
        return squaredNums;
    }
}