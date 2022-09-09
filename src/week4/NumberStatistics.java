package week4;

public class NumberStatistics {
    private int sum;
    private int amountOfNumbers;
    private int number;
    private int average;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        this.average = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double)this.sum / this.amountOfNumbers;
    }
}
