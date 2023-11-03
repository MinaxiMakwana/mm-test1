package morningchallenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Please Enter Greeting");
        String message = scanner.nextLine();
        // String message = "Good Afternoon";
        printMessage(name, message);
scanner.close();
    }
    public static void printMessage(String name, String message){
        System.out.println("Hi " + name);
        System.out.println(message);
    }
    }
