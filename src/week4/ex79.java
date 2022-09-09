package week4;

import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            all.addNumber(number);
            if (number % 2 == 0) {
                even.addNumber(number); } else {odd.addNumber(number); }
            stats.addNumber(number);
        }
        System.out.println("sum: " + all.sum());
        System.out.println("Sum: " + even.sum());
        System.out.println("Sum: " + odd.sum());
    }
}
