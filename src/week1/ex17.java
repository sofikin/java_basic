package week1;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        if (number1 == number2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: " + Math.max(number1, number2));
        }
    }
}
