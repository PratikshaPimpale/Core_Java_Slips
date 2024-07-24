//A) Write a ‘java’ program to check whether given number is Armstrong or not. 
//(Use static keyword)

import java.util.*;
class Demo
{
    static void armstrong(int n)
    {
        int s=0,r=0;
        int org=n;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(s==org)
            System.out.print("Number is armstrong");
        else
            System.out.print("Number is not armstrong");
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        armstrong(n);
    }
}