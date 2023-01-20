class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,i,j,t;
        int freq[]=new int[100];
        for(i=0;i<100;i++)
        {
            freq[i]=0;
        }
        for(i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        freq[val]=0;
        int k=0;
        for(i=0;i<100;i++)
        {
            while(freq[i]!=0)
            {
                nums[k]=i;
                freq[i]--;
                k++;
            }
        }
        return(k);
    }
}