package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Calculator:");
            System.out.println("1 - Rational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex Choose calculator");
            System.out.println("4 - Exit Program");
           int userInput = s.nextInt();
            if (userInput == 4) {
                System.out.println("Program wird beendet");
                return;
            }

            switch (userInput) {
                case 1:
                    System.out.println(" ");
                    System.out.print("Enter number x a>");
                    userInput = s.nextInt();
                    System.out.print("Enter number x b>");
                    userInput = s.nextInt();
                    System.out.print("Enter number x a>");
                    userInput = s.nextInt();
                    System.out.print("Enter number x b>");
                    userInput = s.nextInt();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("3");
                    break;

            }
        }


    }
}

