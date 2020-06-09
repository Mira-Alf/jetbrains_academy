import java.util.Scanner;

class Main {
    private int lowerLimit;
    private int upperLimit;
    private double average;
    private Scanner scanner = new Scanner(System.in);
    public static final int DIVISOR = 3;

    public void setLimits() {
        this.lowerLimit = scanner.nextInt();
        this.upperLimit = scanner.nextInt();
    }

    public void computeAverageOfMultiplesOfDivisor() {

        int numOfMultiples = 0, sumOfMultiples = 0;
        for( int i = this.lowerLimit; i <= this.upperLimit; i++ ) {
            if(i % DIVISOR == 0) {
                numOfMultiples++;
                sumOfMultiples += i;
            }
        }
        this.average = (double)sumOfMultiples/numOfMultiples;
        System.out.println(this.average);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setLimits();
        main.computeAverageOfMultiplesOfDivisor();
    }
}