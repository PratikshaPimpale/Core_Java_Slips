//A)  Write a java program to search given name into the array, if it is found then display 
//its index otherwise display appropriate message. 

import java.util.*;
class Demo
{
    static void search(String a[], String name,int n)
    {
        int i,f=0;
        for(i=0;i<n;i++)
        {
            if(a[i].equals(name))
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.print("Name found index position="+i);
        else
            System.out.print("Name not found");
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        String a[]=new String[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=new String();
            a[i]=sc.next();
        }
        System.out.print("Enter name to search:");
        String name=sc.next();
        search(a,name,n);
    }
}