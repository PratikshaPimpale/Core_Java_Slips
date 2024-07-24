//B)  Write a java program to accept n employee names from user. Sort them in 
//ascending order and Display them.(Use array of object and Static keyword).

import java.util.*;
class Demo
{
    static void sort(String a[], int n)
    {
        int i,pass;
        String t;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(a[i].compareTo(a[i+1])>0)
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new String();
            a[i]=sc.next();
        }
        sort(a,n);
    }
}

//Another way to sort array
/*static void sort(String a[])
    {
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    } */