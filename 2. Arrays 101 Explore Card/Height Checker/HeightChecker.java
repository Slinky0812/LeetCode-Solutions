class HeightChecker {
    public int heightChecker(int[] heights) {
        
        //copy elements from heights array to new array
        int[] sortedHeight = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            sortedHeight[i] = heights[i];
        }
        
        //insertion sort for new array
        for (int index = 1; index < sortedHeight.length; index++) {
            int val = sortedHeight[index];
            int j = index - 1;
            while (j >= 0 && val < sortedHeight[j]) {
                sortedHeight[j+1] = sortedHeight[j];
                j--;
            }
            
            sortedHeight[j+1] = val;
        }
        
        for (int i = 0; i < sortedHeight.length; i++) {
            System.out.printf("%d\n", sortedHeight[i]);
        }
        
        
        int count = 0;
        //comparing elements
        for (int i = 0; i < sortedHeight.length; i++) {
            if (sortedHeight[i] != heights[i]) {
                count++;
            }
        }
        
        return count;
        
    }
}