class Solution {
    int majorityElement(int arr[]) {
         HashMap<Integer, Integer> freq = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

            if (freq.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }

        return -1;
        
    }
}