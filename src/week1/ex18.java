package week1;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int i = Integer.parseInt(reader.nextLine());
        if (i>=0 && i<=29){
            System.out.println("Grade: failed");
        } else if (i>=30 && i<=34){
            System.out.println("Grade: 1");
        } else if (i>=35 && i<=39){
            System.out.println("Grade: 2");
        } else if (i>=40 && i<=44){
            System.out.println("Grade: 3");
        } else if (i>=45 && i<=49){
            System.out.println("Grade: 4");
        } else if (i>=50 && i<=60){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Invalid number!");
        }
    }
}