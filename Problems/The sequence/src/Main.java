import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static final int MAX_VALUE = 30000 + 1;
    private static final int DIVISOR = 4;
    private int numberOfElements;
    private int[] naturalNumbers;
    private int[] multiplesOfDivisor;
    private Scanner scanner = new Scanner(System.in);

    public void setNaturalNumbers() {
        this.numberOfElements = scanner.nextInt();
        this.naturalNumbers = new int[this.numberOfElements];
        int count = 0;
        do {
          this.naturalNumbers[count] = scanner.nextInt();
          count++;
        } while( count < this.numberOfElements );
    }

    public void getMultiplesOfDivisor() {
        this.multiplesOfDivisor = new int[this.numberOfElements];
        int count = 0, indexIncrementer = 0;
        while( indexIncrementer < this.numberOfElements ) {
            if( this.naturalNumbers[indexIncrementer] % DIVISOR == 0 ) {
                this.multiplesOfDivisor[count] = this.naturalNumbers[indexIncrementer];
                count++;
            }
            indexIncrementer++;
        }
        this.multiplesOfDivisor[count] = MAX_VALUE;
    }

    public void getMaximumMultipleOfDivisor() {
        int count = 0, max = Integer.MIN_VALUE;
        while( this.multiplesOfDivisor[count] != MAX_VALUE ) {
            if( this.multiplesOfDivisor[count] > max )
                max = this.multiplesOfDivisor[count];
            count++;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setNaturalNumbers();
        main.getMultiplesOfDivisor();
        main.getMaximumMultipleOfDivisor();

    }
}