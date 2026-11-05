class Solution {
    public int maxProduct(int[] nums) {
        int pref=1,suff=1;
        int maxAns=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;

            pref*=nums[i];
            suff*=nums[nums.length-i-1];
            maxAns= Math.max(maxAns, Math.max(pref, suff));
        }
        return maxAns;
    }
}