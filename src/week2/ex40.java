package week2;

public class ex40 {
    public static void printWhitespaces(int amount) {
        // 40.1
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}