package week2;

import java.util.Random;
import java.util.Scanner;

public class ex41 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int drawnNumber = drawNumber();
        int n = 0;

        while (true) {
            System.out.println("Guess a number: ");
            n = reader.nextInt();

            if (n == drawnNumber) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (n < drawnNumber) {
                System.out.println("The number is greater");
            } else {
                System.out.println("The number is lesser");
            }
        }
    }

    public static int drawNumber() {
        return new Random().nextInt(101);
    }
}
