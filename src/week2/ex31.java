package week2;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int b = Integer.parseInt(reader.nextLine());
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
