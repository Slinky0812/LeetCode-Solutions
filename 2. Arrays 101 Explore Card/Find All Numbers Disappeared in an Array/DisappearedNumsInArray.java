import java.util.*;

class DisappearedNumsInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        //find which values exist in our array and which don't by marking them as negative
        for (int n = 0; n < nums.length; n++) {
            int index = Math.abs(nums[n]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
    
        return result;
    }
}