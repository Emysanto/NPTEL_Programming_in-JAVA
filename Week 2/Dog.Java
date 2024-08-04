//Complete the code by creating the constructor and the getter functions for a class Dog as defined below.
import java.util.Scanner;

// Class Declaration
public class Dog {
    // Instance Variables
    private String name;
    private String breed;
    private int age;
    private String color;
    Dog(String n,String b,int a,String color)
    {
        this.name=n;
        this.breed=b;
        this.age=a;
        this.color=color;
    }
   String getName()
    {
        return(name);
    }
    String getBreed()
    {
        return (breed);
    }
    int getAge()
    {
        return(age);
    }
    String getColor()
    {
        return(color);
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String breed = scanner.nextLine();
        int age = scanner.nextInt();
        String color = scanner.next();
        
        Dog tommy = new Dog(name, breed, age, color);
        
        System.out.println("Hi my name is: " + tommy.getName());
        System.out.println("My breed is: " + tommy.getBreed());
        System.out.println("My age is: " + tommy.getAge());
        System.out.print("My color is: " + tommy.getColor());
        
        scanner.close();
    }
}