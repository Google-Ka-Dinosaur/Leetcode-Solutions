class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int n3[]=new int[l];
        int i=0,j=0,k=0;
        while(i!=nums1.length&&j!=nums2.length)
        {
           if(nums1[i]<nums2[j])
           {
               n3[k]=nums1[i];
               k++;
               i++;
           }
           else
           {
               n3[k]=nums2[j];
               k++;
               j++;
           }
        }
        while(i!=nums1.length)
        {
            n3[k]=nums1[i];
               k++;
               i++;
        }
        while(j!=nums2.length)
        {
            n3[k]=nums2[j];
               k++;
               j++;
        }

        if(l%2==0)
        return((n3[(l-1)/2]+n3[l/2])/2.00);
        return(n3[l/2]);
    }
}