package week4;

public class ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
    }
}
