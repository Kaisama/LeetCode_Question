class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        int restVal = 0;
        int foundResult = 0;
        for(int i=0; i< nums.length-1; i++){
            if(target == 0){
                if(nums[i]==0)
                    restVal=0;
                else if(nums[i]<0)
                    restVal = -nums[i];
            }
            else
                restVal = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(restVal == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    foundResult = 1;
                    break;
                }
            }
            if(foundResult==1)
                break;
        }
        return result;
    }
}
