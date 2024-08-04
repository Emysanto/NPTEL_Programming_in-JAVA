import java.util.Scanner;
//Create a class Circle that encapsulates the properties of a circle.

//The class should have a private field for the radius, a constructor to initialize the radius, and methods to calculate the area and circumference of the circle.

//NOTE: use Math.PI for PI calculations (DO NOT USE 22/7)

import java.lang.*;
class Circle{
    private double r;
    Circle(double r1)
    {
        r=r1;
        
    }
   double calculateArea()
    {
       return(Math.PI*r*r);
    }
   double calculateCircumference()
    {
        return(2*Math.PI*r);
    }
    
}
public class W02_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Create circle object
        Circle circle = new Circle(radius);

        // Calculate and print area
        double area = circle.calculateArea();
        // Print area to 2 decimal places
        System.out.printf("Area: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.calculateCircumference();
        // Print circumference to 2 decimal places
        System.out.printf("Circumference: %.2f", circumference);
        scanner.close();
    }
}