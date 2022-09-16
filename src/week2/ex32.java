package week2;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        System.out.println("Until what?: ");
        int n = Integer.parseInt(reader.nextLine());
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
