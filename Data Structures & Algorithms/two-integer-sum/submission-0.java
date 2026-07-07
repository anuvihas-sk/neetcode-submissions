class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            int val = target - nums[i];

            if(a.containsKey(val)){ 
                return new int[] { a.get(val), i };
            }
            a.put(nums[i],i);
            }

        return new int[] {};
        } 
}
