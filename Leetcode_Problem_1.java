class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) {
                    return true;
        }
        
    }
}
        return false;
    }
    public static boolean repeat(int[] nums){
   for(int i=0; i<nums.length-1; i++) {
       
           if(nums[i] == nums[i+1]) {
            return true;
           }
        
    }
    return false;
}
}
