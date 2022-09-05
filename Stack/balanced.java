import java.util.*;
import java.io.*;
import java.lang.*;

class balanced 
{
    public static boolean matching(char a,char b)
    {
        return ((a=='(' && b==')')||
                (a=='{' && b=='}')||
                (a=='['&& b==']'));
    }
    static boolean isBalanced(String str)
    {
        Deque<Character> s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            if(x=='c'|| x=='{'||x=='{')
            {
                s.push(x);
            }
            else
            {
                    if(s.isEmpty()==false)
                    {
                        return false;
                    }
                    else if(matching(s.peek(),x)==false)
                    {
                        return false;
                    }
                    else
                    {
                        s.pop();
                    }
            }
        }
        return (s.isEmpty()==true);
   }
   public static void main(String[] args)
   {
       String str = "{()}[]";
       if(isBalanced(str))
       {
           System.out.print("Balanced");
       }
       else
       {
           System.out.print("Not balanced");
       }
   }
}
