class Solution {
	int missingNum(int arr[]) {
		long n = arr.length+1;
		long expectedSum = n*(n+1)/2;
		long sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return (int)(expectedSum-sum);
	}
}
