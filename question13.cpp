class Solution {
public:
    int romanToInt(string s) {
        int arr[]={'I','V','X','L','C','D','M'};
        int val[]={1,5,10,50,100,500,1000};
        int sum=0;
        int i,j;
        for(i=0;i<s.length()-1;i++)
        {
            char ch=s.at(i);
            char ch2=s.at(i+1);
            for(j=0;j<7;j++)
            {
                if(arr[j]==ch)
                {
                    if((ch=='C'&&(ch2=='D'||ch2=='M'))||(ch=='I'&&(ch2=='V'||ch2=='X'))||(ch=='X'&&(ch2=='L'||ch2=='C')))
                    sum-=val[j];
                    else
                    sum+=val[j];
                }
            }
        }
        for(j=0;j<7;j++)
            {
                if(arr[j]==s.at(s.length()-1))
                {
                    sum+=val[j];
                }
            }
        return sum;
    }
};