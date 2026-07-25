class Solution {
	public int maxConsecBits(int[] arr) {
		int a = 0;
		int b = 0;
		int max = 0;
		for (int i = 0; i<arr.length; i++) {
		
				if (arr[i] == 1) {
					a++;
					max = Math.max(a, max);
					
				} else{
				    a=0;
				}
		
				if (arr[i] == 0) {
					b++;
					max = Math.max(b, max);
					
				} else{
				    b=0;
				}
			
		       
				
			
		}
			return max;
		}
	}
