package week2;

public class ex40 {
    public static void printWhitespaces(int amount) {
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

    public static void xmasTree(int height) {
        int space = (height) - 1;
        int star = 1;

        for (int i = 0; i < height; i++) {

            printWhitespaces(space);
            printStars(star);
            space--;
            star = star + 2;
        }

        for (int i = 0; i < 2; i++) {

            printWhitespaces((height) - 2);
            printStars(3);
        }


    }

    public static void main(String[] args) {
        xmasTree(10);
    }
}