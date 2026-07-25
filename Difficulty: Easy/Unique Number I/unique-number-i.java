class Solution {
    public int findUnique(int[] arr) {
        int z=0;
        for(int i=0;i<arr.length;i++){
            z=z^arr[i];
        }
        return z;
    }
}