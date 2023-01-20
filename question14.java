class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i,j,t;
        int fg;
        String ans="",sc;
        t=strs[0].length();
        while (t>0)
        {
         sc=strs[0].substring(0,t);
         t--;
         fg=1;
         for(j=0;j<strs.length;j++)
         {
             if(!strs[j].startsWith(sc))
             {
             fg=0;
             break;
             }
         }
         if(fg==1)
         {
             ans=sc;
             break;
         }
        }
        return ans;
    }
}