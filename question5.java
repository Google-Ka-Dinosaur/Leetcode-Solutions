class Solution {
    public String longestPalindrome(String s) {
        int l=s.length();
        String h="",hrev="",srev="";
        int i,k;
        for(i=s.length()-1;i>=0;i--)
                {
                    srev=srev+s.charAt(i);
                }
        while(l>=1)
        {
            for(k=0;k+l<=s.length();k++)
            {
                h=s.substring(k,l+k);
                hrev=srev.substring((srev.length()-(l+k)),(srev.length()-k));
                if(h.equals(hrev))
                return h;
            }
            l--;
        }
        return h;
    }
}