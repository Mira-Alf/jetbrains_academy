import java.util.Scanner;
class Main {
    private int lowerLimit;
    private int upperLimit;
    private int divisor;
    private Scanner scanner = new Scanner(System.in);

    public void getLimitsAndDivisor() {
        this.lowerLimit = scanner.nextInt();
        this.upperLimit = scanner.nextInt();
        this.divisor = scanner.nextInt();
    }

    public void computeCountOfNumbersUsingLoop() {
        int count = 0, increment = 1;
        for( int i = this.lowerLimit; i <= this.upperLimit; ) {
            if( i % this.divisor == 0 ) {
                count++;
                increment = divisor;
            }
            i += increment;
        }
        System.out.println(count);
    }

    public void computeCountOfNumbersWithoutLoop() {
        int numbersInTheRange = this.upperLimit - this.lowerLimit - 1;
        int divisibleNumbers = numbersInTheRange/this.divisor;
        divisibleNumbers += (this.upperLimit % this.divisor == 0) ? 1 : 0;
        divisibleNumbers += (this.lowerLimit % this.divisor == 0 ) ? 1 : 0;
        if( divisibleNumbers == 0 )
            divisibleNumbers = ( numbersInTheRange + 2 ) % this.divisor == 0 ? 1 : 0;
        System.out.println(divisibleNumbers);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getLimitsAndDivisor();
        main.computeCountOfNumbersUsingLoop();
    }
}