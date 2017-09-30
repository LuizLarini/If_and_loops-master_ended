import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    // Look up the documentation for Scanner and what methods are available
    private Main() {

    }

    //TODO: Write a Java program to compare two numbers.

    public void compare(){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (number1 == number2){
            System.out.println();
        }
        else{
            System.out.println();
        }
    }


    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".
    public  void Reader(){
        Scanner reader = new Scanner(System.in);
        int inputNumber = reader.nextInt();
        if (inputNumber == 0){
            System.out.println();
        }
        else if (inputNumber > 0){
            System.out.println();
        }
        else if (inputNumber < 0){
            System.out.println();
        }
    }




    // TODO: Write a program in Java to display the first 10 natural numbers.






    // TODO: Write a Java program to reverse a string. Print the before and after.
}
