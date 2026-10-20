class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        int[] arr=new int[nums.length];
        for(int i:nums){
            if(i>0){
                arr[pos]=i;
                pos=pos+2;
            }else{
                arr[neg]=i;
                neg=neg+2;
            }
        }
        return arr;
    }
}