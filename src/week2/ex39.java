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

    public static void main(String[] args) {
        printSquare(4);
    }
}
