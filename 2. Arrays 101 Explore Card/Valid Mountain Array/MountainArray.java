class MountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }
        
        int end = arr.length;
        int i = 0;
        
        while (i+1 < end && arr[i] < arr[i+1]) {
            i++;
        }
        
        if (i == 0 || i == end - 1) {
            return false;
        }
        
        while (i + 1 < end && arr[i] > arr[i+1]) {
            i++;
        }
        
        return i == end-1;
    }
}