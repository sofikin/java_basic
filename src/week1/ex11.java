package week1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("The biggest number of the two numbers given was: " + Math.max(number1, number2));
    }
}
