package week1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: \n");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (x + y));;
    }
}
