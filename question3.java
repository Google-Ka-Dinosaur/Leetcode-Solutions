
   class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ans="";
        int i;
        int max=0;
       for(i=0;i<s.length();i++)
       {
           if(ans.indexOf(s.charAt(i))==-1)
           {
               ans=ans+s.charAt(i);
           }
           else
           {
               if(ans.length()>max)
               {
                   max=ans.length();
               }
                  ans=ans.substring(ans.indexOf(s.charAt(i))+1)+s.charAt(i);
           }
       }
       if(ans.length()>max)
       max=ans.length();
       return max;
    }
}