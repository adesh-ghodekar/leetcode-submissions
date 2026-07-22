class Solution {
    public int removeElement(int[] nums, int val) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                j=i;
                break;
            }else if(nums[i]!=val && i==nums.length-1){
                return nums.length;
            }
        }
        if(j==-1){
            return 0;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return j;
    }
}