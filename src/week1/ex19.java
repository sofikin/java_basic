package week1;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
