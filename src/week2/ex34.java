package week2;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Type a number: ");
        int n = reader.nextInt();
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is: " + factorial);
    }
}

