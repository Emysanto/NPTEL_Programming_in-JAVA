//There are two class cls1 and cls2 which is subclass of cls1.  cls1 having a method "add" which add two numbers. Create two method inside cls2 which will take 2 parameters as input i.e. a //d b and print the sum , multiplication and sum of their squares i.e (a^2) + (b2).

import java.util.Scanner;
class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}
//Create subclass cls2 of cls1 which perform task of multiplication and sum of squares of passing two parameters.
class cls2 extends cls1
{
  void mul(int v,int y)
  {System.out.println(v*y);
  }
  void task(int k,int u)
  {System.out.println(k*k+u*u);
  }
}
public class W03_P2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        //String tilde=sc.next();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    
    }
}