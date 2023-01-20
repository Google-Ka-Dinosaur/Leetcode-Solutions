int removeDuplicates(int* nums, int numsSize){
    int i,max=*(nums+0);
        for(i=0;i<numsSize;i++)
        {
            if(*(nums+i)>max)
            max=*(nums+i);
        }
        int arr[201];
        for(i=0;i<201;i++)
        {
            arr[i]=0;
        }
        int count=0;
        for(i=0;i<numsSize;i++)
        {
            if(arr[*(nums+i)+100]==0)
            {
                count++;
                arr[*(nums+i)+100]=1;
            }
        }
        int index=0;
       for(i=0;i<201;i++)
        {
            if(arr[i]==1)
            {
            *(nums+index)=i-100;
            index++;
            }
        }
        return count;
    }
