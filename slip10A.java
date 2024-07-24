//A) Write a java program to count the frequency of each character in a given string. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter string:");
        String s1=sc.next();
        char ch;
        int cnt;
        for(int i=0;i<s1.length();i++)
        {
            cnt=0;
            ch=s1.charAt(i);
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)==ch)
                {
                    cnt++;
                }
            }
            System.out.println(ch+" occurs "+cnt+" times");
        }
    }
}