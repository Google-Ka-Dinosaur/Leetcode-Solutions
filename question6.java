class Solution {
    public String convert(String s, int numRows) {
       String mat[]=new String[numRows];
        int l=s.length();
     int i=0,k=0;
        String ans="";
        for(i=0;i<numRows;i++)
        {
            mat[i]="";
        }
        i=0;
        while(i<l)
        {
            for(k=0;k<numRows;k++)
            {
                if(i>=l)
                break;
            mat[k]=mat[k]+s.charAt(i);
            i++;
            }
            for(k=numRows-2;k>0;k--)
            {
                 if(i>=l)
                break;
            mat[k]=mat[k]+s.charAt(i);
            i++;
            }
        }
       for(i=0;i<numRows;i++)
       {
           ans=ans+mat[i];
       }
       return ans;
    }
}