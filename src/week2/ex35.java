package week2;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());

        double sum = Math.pow(2, power + 1) - 1;
        System.out.println("The result is: " + (int)sum);
    }
}
