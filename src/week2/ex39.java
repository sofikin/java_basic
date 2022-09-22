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

    private static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++; if (i > size) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
