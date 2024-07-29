//A)  Write a java program to check whether given string is palindrome or not. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s1=sc.next();
        int l=s1.length();
        System.out.print("Reversed string:");
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }

    }
}