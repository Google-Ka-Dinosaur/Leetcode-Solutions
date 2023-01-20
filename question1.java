class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int x[]=new int[2];
        x[0]=-1;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    x[0]=i;
                    x[1]=j;
                    break;
                }
            }
            if(x[0]!=-1)
            {
                break;
            }
        }
        return x;
    }
}