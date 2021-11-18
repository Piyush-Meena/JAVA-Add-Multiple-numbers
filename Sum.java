import java.util.Scanner;  // Import the Scanner class

public class MyClass {
  public static void main(String[] args) {
    int x, y,z, sum;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input
    
    System.out.println("Type another number:");
    z = myObj.nextInt(); // Read user input

    sum = x + y + z;
    System.out.println("Sum is: " + sum); // Output user input
  }
} 
