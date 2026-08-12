class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] arr = new int[len];
            
        int prod = 1;

        for (int i=0; i < len; i++){
            arr[i] = prod;
            prod = prod*nums[i];

        }
        prod = 1;
        for (int j=len-1; j >= 0; j--){
            arr[j] = arr[j] * prod;
            prod = prod*nums[j];
        }    

        return arr;
        
    }
}  
