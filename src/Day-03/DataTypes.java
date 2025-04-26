import java.lang.*;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        byte isLoggedIn = 1;
        short myAge = 23;
        int accountNumber = 276493221;
        long aadharNumber = 514525415268L;
        char symbol = 'A';
        float gst = 9.75f;
        double gstCollection = 1524853.256421;
        boolean isLoggedOut = false;
        String username = "Laxman Krishnamurti";
        username = "Sonu Kumar";
        System.out.println("username : " +  username);

        Scanner userdata = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String userName = userdata.nextLine();
        System.out.println("Hello " + userName);
        System.out.print(userName + ", please also tell me your age : ");
        byte userAge = userdata.nextByte();
        if (userAge > 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are a teenager so you can't vote");
        }
    }
}