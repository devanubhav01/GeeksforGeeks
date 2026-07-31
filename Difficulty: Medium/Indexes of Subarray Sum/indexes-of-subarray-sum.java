
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
         ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];

            while(sum > target && i < j) {
                sum = sum - arr[i];
                i++;
            }

            if (sum == target) {
                nums.add(i + 1);
                nums.add(j + 1);
                return nums;
            }
        }

        nums.add(-1);
        return nums;
        
    }
}
