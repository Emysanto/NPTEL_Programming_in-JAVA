//Write a Java program and compute the sum of an integer's digits

import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
// Calculate the sum of the digits by defining a sumDigits() function
// This should return the sum
 public static long sumDigits(long a)
    {  long b=a;
        long c=0;
        while(b!=0)
        {c=c+b%10;
        b=b/10;}
    return(c);
    }
}