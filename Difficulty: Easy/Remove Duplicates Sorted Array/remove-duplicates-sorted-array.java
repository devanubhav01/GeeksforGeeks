class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
       int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        if (n == 0) return result;
        
        int i = 0; 
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        

        for (int k = 0; k <= i; k++) {
            result.add(arr[k]);
        }
        
        return result;

        
    }
}
