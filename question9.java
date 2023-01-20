class Solution {
    public int myAtoi(String s) {
        int ng=0,i=0,n;
        s=s.trim();
        if(s.equals(""))
        return 0;
        String s1,s2;
        if(s.charAt(0)=='-')
        {
        ng=1;
        s=s.substring(1);
        }
        else if(s.charAt(0)=='+')
        {
        ng=0;
      s=s.substring(1);
        }
        while(i<s.length())
        {
            n=(int)s.charAt(i);
            if(n<48||n>57)
            {
                break;
            }
            i++;
        }
        s=s.substring(0,i);
        i=0;
        if(s=="")
        return 0;
        while(s.charAt(i)=='0' )
        {
            i++;
           if(i==s.length())
           return 0;
        }
        s=s.substring(i);
       i=0;
       n=0;
       s1=Integer.toString(Integer.MAX_VALUE);
       s2=Integer.toString(Integer.MIN_VALUE);
       if(s.length()>10)
       {
           if(ng==0)
           return Integer.parseInt(s1);
           else
           return Integer.parseInt(s2);
       }
       if(s.length()==10)
       {
           if(ng==1)
           s='-'+s;
           if(ng==0&&s.compareTo(s1)>0)
           return Integer.parseInt(s1);
           else if(ng==1 &&s.compareTo(s2)>0)
           return Integer.parseInt(s2);
           else
           return Integer.parseInt(s);
       }
       else
       {
           if(ng==1)
           s='-'+s;
          return Integer.parseInt(s);
       }
      
    }
}