//Write a Java program to convert an integer number to a binary number.

import java.util.Scanner;

public class W01_P5 {
    public static void main(String args[]) {
        // Declare variables to store decimal number, quotient, and an array for binary
        // digits
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        // System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;
        int bin_num1[]=new int[100];
        // Initialize the quotient with the decimal number
        quot = dec_num;
        int k=0;
        while(quot!=0)
        {
            bin_num1[k]=quot%2;
            quot=quot/2;
            k++;
        }
        for(int p=0;p<=k;p++)
        { bin_num[i]=bin_num1[p];
        i++;
        }
        
      i=k+1;
      // Display the binary representation of the decimal number
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        //System.out.print("\n");
    }
}