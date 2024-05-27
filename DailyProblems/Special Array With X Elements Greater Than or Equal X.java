class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
        }

        for(int i=max;i>=0;i--){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i) count++;
            }

            if(count == i) return i;
        }

        return -1;
    }
}
