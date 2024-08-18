//Complete the code segment to swap two numbers using call by object reference

import java.util.Scanner;
class Question {   //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class W04_P1 {
    static void swap(Question t)
{
  
  int a=t.e1;
  t.e1=t.e2;
  t.e2=a;
  
  
}

public static void main(String[] args) {
    Question t = new Question();
    System.out.println("Before Swap: " + t.e1 + " " + t.e2);
    swap(t);
    System.out.print("After Swap: " + t.e1 + " " + t.e2);
  }
}