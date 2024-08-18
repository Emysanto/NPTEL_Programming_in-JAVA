//Write a program to take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.

import java.util.*;

public class W03_P4{
public static void main(String[] args) {

String choice = "";
Scanner input = new Scanner(System.in);
// Add your code
        int a;
float s=0;
        int b = 1;
int c=0;
     for (int i = 0; i < 1000; i++) {
            // Check if the next token is an integer
            if (input.hasNextInt()) {
                a = input.nextInt();
            } else {
                choice = input.next(); // Capture the next token
                if (choice.equals("q")) {  // Use .equals() for string comparison
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer or 'q' to quit.");
                    continue;
                }
            }
            b = b * a;
       s=s+a;
       c=c+1;
        }
        System.out.println("Product is: "+b);
 System.out.println("Average is: "+(s/c));

}
}