/*
Erik Sandoval
COSC 2336-01
Programming Assignment 1
Due: Jan 31, 12:00AM, 2022
Submitted: Jan 30, 2022
This program will reverse a string using recursion and then display it to
the user. It contains a class named RecursiveReverseStringErikSandoval, a
main method, and a method named reverseString. The main method will call
the reverseString method and display the reversed string to the user.
Amazon Corretto 17.0.2
Java
 */
import java.util.Scanner; // import the Scanner class

public class RecursiveReverseStringErikSandoval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object
        System.out.print("Enter a string: "); // prompt user for input
        String value = input.nextLine(); // store input in String value
        System.out.print("\nThe reverse of " + value + " is "); // display
        reverseDisplay(value); // call reverseDisplay method
    }
    public static void reverseDisplay(String value) { // method to reverse
        if (value.length() == 0) { // if string is empty
            return; // return
        }
        reverseDisplay(value.substring(1)); // call method with substring
        System.out.print(value.charAt(0)); // display first character, etc...
    }
}
