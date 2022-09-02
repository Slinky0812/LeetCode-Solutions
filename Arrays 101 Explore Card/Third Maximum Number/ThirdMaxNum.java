import java.util.*;

class ThirdMaxNum {
    public int thirdMax(int[] nums) {    
       
        Arrays.sort(nums);
        
        int index = nums.length - 1;
        int i = 0;
        int distinctCount = 0;
        
        while(index >= 0)
        {
            distinctCount++;
            i = index - 1;
            while(i >= 0 && nums[i] == nums[index])
                i--;
            if(i == -1)
                return nums[nums.length - 1];
            index = i;
            if(distinctCount == 2)
                return nums[index];
        }
        return -1;
    }
}