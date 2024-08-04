//Create a class Rectangle with attributes length and width.Provide two constructors: one with no parameters (default to 1) and another with parameters to initialize the attributes.

//Use the this keyword to avoid name space collision.Create a getArea() function that returns the area of the rectangle.

import java.util.Scanner;
class Rectangle {
     private Double length;
        private Double width;
    Rectangle()
    {
       this.length=1.0;;
       this.width=1.0;
        
    }
    Rectangle(Double length,Double width)
    {
        this.length=length;
        this.width=width;
       
    }
    Double getLength()
    {return(length);
        }
    Double getWidth() 
    {return(width);
        }
    Double getArea()
    {
      return(length*width);
    }
    
    
    
// Write the definition of the class here
// Create 2 private variables 
// Create a default constructor 
// Create a parameterised constructor
// Create getength(), getWidth() and getArea() functions
}
class W02_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        // System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        // System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterised Rectangle: L, W, A : ");
        System.out.print(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}