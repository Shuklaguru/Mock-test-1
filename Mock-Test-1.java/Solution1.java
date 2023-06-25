class Solution1 {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int n = nums.length;
       
       for(int i=0; i<n; i++){
           if(nums[i]!=0){
               int temp = nums[i];
                 nums[i]= nums[l];
                 nums[l]= temp;
                 l++;
           }
       }
            
        

    }
}
     
