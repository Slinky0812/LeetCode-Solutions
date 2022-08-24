class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //n is length of nums2
        //m+n is length of nums1
                
        int length = 0;
        
        for (int i = m; i < m+n; i++) {
            while (length < n) {
                nums1[i] = nums2[length];
                break;
            }
            length++;
        }
        
        boolean sorted = true;
        while (sorted) {
            int count = 0;
            for (int i = 0; i < m+n; i++) {
                boolean swap = true;
                while (swap && (i+1 != m+n)) {
                    if (nums1[i] > nums1[i+1]) {
                        int temp = nums1[i+1];
                        nums1[i+1] = nums1[i];
                        nums1[i] = temp;
                        count++;
                    } else {
                        swap = false;
                    }
                }
            }
            if (count == 0) {
                sorted = false;
            }
        }
        

    }
}