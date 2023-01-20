class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        int i;
        char arr[]=new char[l];
        char ch;
        int fg=1;
int top=-1;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                top++;
             arr[top]=ch;
            }
            else
            {
                if(top!=-1)
                {
                if((ch=='}'&&arr[top]=='{')||(ch==']'&&arr[top]=='[')||(ch==')'&&arr[top]=='('))
                {
                    top--;
                }
                else
                {
                    fg=0;
                break;
                }
                }
                else
                {
                    fg=0;
                    break;
                }
            }
        }
        if(top==-1&&fg==1)
        return true;
        return false;
    }

}