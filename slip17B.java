// B) Define a class Product (pid, pname, price, qty). Write a function to accept the product  
//details, display it and  calculate total amount. (use array of Objects) 

import java.util.*;
class Product
{
    int pid,qty;
    String pname;
    float price,amt;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter product id, name, price, Quantity:");
        pid=sc.nextInt();
        pname=sc.next();
        price=sc.nextFloat();
        qty=sc.nextInt();
    }
    void cal()
    {
        amt=qty*price;
    }
    void disp()
    {
        cal();
        System.out.println("\nProduct id="+pid);
        System.out.println("Product name="+pname);
        System.out.println("Total bill="+amt);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Product ob[]=new Product[n];
        int i;
        for(i=0;i<n;i++)
        {
            ob[i]=new Product();
            ob[i].accept();
        }
        for(i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }
}