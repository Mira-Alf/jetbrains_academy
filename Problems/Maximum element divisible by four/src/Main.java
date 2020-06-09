import java.util.Scanner;
class Main {
    private int numberOfElements;
    private int[] naturalNumbers;
    private int[] multiplesArray;
    private Scanner scanner = new Scanner(System.in);
    private static final int DIVISOR = 4;

    public void setNaturalNumbersSequence() {
        this.numberOfElements = scanner.nextInt();
        this.naturalNumbers = new int[this.numberOfElements];
        int count = 0;
        do {
            this.naturalNumbers[count] = scanner.nextInt();
            count++;
        } while( count < this.numberOfElements );
    }

    public void gatherNumbersDivisibleByDivisor() {
        this.multiplesArray = new int[ this.numberOfElements ];
        int count = 0;
        for( int num : this.naturalNumbers ) {
            if( num % DIVISOR == 0 ) {
                this.multiplesArray[count] = num;
                count++;
            }
        }
        this.multiplesArray[count] = Integer.MAX_VALUE;
    }

    public void getMaximumFromMultiplesArray() {
        int count = 0, maxValue = Integer.MIN_VALUE;
        while( this.multiplesArray[count] != Integer.MAX_VALUE ) {
            if( this.multiplesArray[count] > maxValue )
                maxValue = this.multiplesArray[count];
            count++;
        }
        System.out.println(maxValue);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setNaturalNumbersSequence();
        main.gatherNumbersDivisibleByDivisor();
        main.getMaximumFromMultiplesArray();
    }
}