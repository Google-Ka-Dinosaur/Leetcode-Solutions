class Solution {
    public int strStr(String haystack, String needle) {
        String k;
        int l=0;
        while(l+needle.length()<=haystack.length())
        {
        k=haystack.substring(l,l+needle.length());
        if(k.equals(needle))
        return l;
        l++;
        }
        return -1;
    }
}