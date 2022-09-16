package week2;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int b = Integer.parseInt(reader.nextLine());

        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println("Sum is " + sum);
    }
}
