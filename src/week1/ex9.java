package week1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        double result = number1 / (double)number2;

        System.out.println("Division: " + result);
    }
}
