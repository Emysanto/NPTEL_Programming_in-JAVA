//Write a Java program to display n terms of natural numbers and their sum.
import java.util.Scanner;

public class W01_P3 {

  public static void main(String[] args)

  {
    int i, n, sum = 0;
      Scanner in = new Scanner(System.in);
      // System.out.print("Input number: ");
      n = in.nextInt();
    System.out.printf("The first %d natural numbers are : \n",n);
for(i=1;i<=n;i++)
{sum=sum+i;
 System.out.println(i);
}
// Use loop to display n natural numbers
//sum the natural numbers up to n.
System.out.printf("The Sum of Natural Number upto %d terms : %d",n,sum);
  }
}