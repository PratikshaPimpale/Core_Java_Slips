//A) Write a java program to display all the vowels from a given string. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s1=sc.nextLine();
        char ch;
        System.out.print("Vowels:");
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                System.out.print(ch);
        }
    }
}