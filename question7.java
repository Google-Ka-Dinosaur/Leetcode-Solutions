class Solution {
    public int reverse(int x) {
        int rev=0,i;
        int ng=0;
       if(x==-2147483648)
       return (0);
        if(x<0)
        {
            ng=1;
            x=Math.abs(x);
        }
        String st=Integer.toString(x);
        int l=st.length();
        String s="";
        for(i=0;i<l;i++)
        {
            s=st.charAt(i)+s;
        }
        if(s.compareTo("2147483647")>0&&s.length()==10&&ng==0)
        return 0;
        if(s.compareTo("2147483648")>0&&s.length()==10&&ng==1)
        return 0;
      else
      {
          if(ng==1)
          {
              s="-"+s;

          }
          return(Integer.parseInt(s));
      }
    }
}