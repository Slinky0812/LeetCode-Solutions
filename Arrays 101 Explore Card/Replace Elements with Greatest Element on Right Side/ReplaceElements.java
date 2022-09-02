class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        
    if (arr.length == 1) {
      arr[0] = -1;
      return arr;
    }
    
    int max = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
        
      if (arr[i] > max) {
        int temp = max;
        max = arr[i];
        arr[i] = temp;
      } else {
        arr[i] = max;
      }
    }

    arr[arr.length - 1] = -1;
    
    return arr;
      
  }
}