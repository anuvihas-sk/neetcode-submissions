class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        if (nums.length == 0) return 0;

        for( int num : nums) set.add(num);
      
        int max = 1;
        int count = 1;

        for (int num : set) {

           if( !set.contains(num - 1)) {

                count = 1;
            
                while(set.contains(num + 1)){
                    
                    count ++;
                    num++;

                    max = Math.max(max, count);

                }
           
           }
        
        } 
        return max;

    
}
}

