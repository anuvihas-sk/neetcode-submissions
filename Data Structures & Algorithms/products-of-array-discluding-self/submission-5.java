class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] arr = new int[len];

        int prod = 1;
        for (int i = 0; i < len; i++) {
            prefix[i] = prod;
            prod = prod * nums[i];
        }

        prod = 1;
        for (int j = len - 1; j >= 0; j--) {
            suffix[j] = prod;
            prod = prod * nums[j];
        }

        for (int i = 0; i < len; i++) {
            arr[i] = prefix[i] * suffix[i];
        }

        return arr;
        
    }
}  
