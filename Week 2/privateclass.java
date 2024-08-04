/*Create a class Student with private attributes for name and age.

Use a constructor to initialize these attributes and provide public getter methods to access them.

In the main method, an instance of Student is created and the student's details are printed.*/
import java.util.Scanner;
class Student {
  private String a;
  private int b;
// Write
    Student(String name ,int age)
    {a=name;
      b=age;
    }
    String getName()
    {
        return(a);
    }
    int getAge()
    {
           return(b);
    }
// Write the definition of the class here
// Create 2 private variables name and age
// Create a constructor 
// Create getName() and getAge() functions
}

class W02_P2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read input
    // System.out.print("Enter name: ");
    String name = scanner.nextLine();
    // System.out.print("Enter age: ");
    int age = scanner.nextInt();

    // Create Student object
    Student student = new Student(name, age);

    // Print student details
    System.out.println("Student Name: " + student.getName());
    System.out.print("Student Age: " + student.getAge());

    scanner.close();
  }
}

