class Solution {
    int count =0;
    public int findTargetSumWays(int[] nums, int target) {
        compute(nums,0,0,target);
        return count;
    }
    public void compute(int[] nums,int sum,int index, int target){
        if(index==nums.length){
            if(sum==target){
                count++;
            }
        }
            else{
                    compute(nums,sum+nums[index],index+1,target);
                    compute(nums,sum-nums[index],index+1,target);
            }
    }
    }
