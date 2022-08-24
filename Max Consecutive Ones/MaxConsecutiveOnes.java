class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ones = 0;
        int maxOnes = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
                if (ones > maxOnes) {
                    maxOnes = ones;
                }
            } else {
                ones = 0;
            }
        }
        
        return maxOnes;
    }
}
