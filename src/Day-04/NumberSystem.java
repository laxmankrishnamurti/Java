import java.lang.*;
import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        System.out.println("Number System");
         // Swap();
        EvenOrOdd();
    }

    // Create a program to swap two numbers

    public static void Swap(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a value for X : ");
        float x = userInput.nextFloat();
        System.out.print("Enter a value for Y : ");
        float y = userInput.nextFloat();
        float temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping");
        System.out.println("X : " + x + " Y : " + y);
    }

    // Create a program to check if the given number is even or odd using bitwise operator

    public static void EvenOrOdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int status = number & 1;

        if(status == 1){
            System.out.println("Odd Number");
        }else {
            System.out.println("Even Number");
        }
    }
}