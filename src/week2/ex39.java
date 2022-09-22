package week2;

public class ex39 {
    private static void printStars(int amount) {
        int times = 1;
        while (true) {
            System.out.print("*");
            if (times == amount) {
                break;
            }
            times++;
        }
        System.out.println();
    }

    private static void printSquare(int sideSize) {
        int i = 1;
        while (i <= sideSize) {
            printStars(4);
            i++;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 1;
        while (i <= width && i <= height) {
            printStars(width);
            i++;
        }
    }

    public static void main(String[] args) {
        printRectangle(17, 3);
    }
}
