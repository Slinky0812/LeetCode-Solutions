class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int valCount = 0;
        int noVal = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                valCount++;
            } else {
                noVal++;
            }
        }
        
        if (noVal == nums.length) {
            return nums.length;
        }
        
        int run = 0;
        while(run < valCount) {
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {

                    for (int j = i + 1; j < nums.length; j++) {
                        nums[j-1] = nums[j];
                    }

                }
            }
            
            run++;
        }
        
        return noVal;
    }
}