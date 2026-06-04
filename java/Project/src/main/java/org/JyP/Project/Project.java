package org.JyP.Project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { 
            System.out.println("1 число: ");
            int x = scan.nextInt();
            System.out.println("2 число: ");
            int y = scan.nextInt();
            System.out.println("Математический символ (+, -, *, /): ");
            String ms = scan.next();

            switch (ms) {
                case "+" -> {
                    System.out.println(x + y);
                    break;
                }
                case "-" -> {
                    System.out.println(x - y);
                    break;
                }
                case "*" -> {
                    System.out.println(x * y);
                    break;
                }
                case "/" -> {
                    if (y != 0) {
                        System.out.println(x / y);
                    }
                    else {
                        System.out.println("ERROR breaked...");
                        break;
                    }
                    break;
                }
                default -> System.out.println("ERROR");
            }
        }
    }
}
