/*Write a Java program to make such a pattern like a right angle triangle with the number increased by 1
for n=3:

1 

2 3

4 5 6*/

import java.util.Scanner;

public class W01_P4 {

  public static void main(String[] args)

  {
    int i, j, n, k = 1;

    //System.out.print("Input number of rows : ");

    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    for(j=1;j<=n;j++)
{for(i=1;i<=j;i++)
{System.out.print(k+" ");
 k++;
 
}System.out.println();
}
//use nested for loop for printing pattern like a right angle triangle with the number increased by 1.
}}