import java.util.Scanner;

class Main {

    public static boolean isIncreasingOrder( int num1, int num2 ) {
        return num1 < num2;
    }

    public static void main(String[] args) {
        boolean isAscending = true, isOrdered = true, shouldProcess = true;

        Scanner scanner = new Scanner(System.in);
        int numberInTheSequence = scanner.nextInt();
        int previousNumber = 0;
        int countOfNumbers = 1;

        while( numberInTheSequence != 0 ) {
            if( previousNumber == 0 ) {
                previousNumber = numberInTheSequence;
            } else if( countOfNumbers == 2 ) {
                isAscending = previousNumber == numberInTheSequence || isIncreasingOrder(previousNumber, numberInTheSequence);
            } else {
                if( shouldProcess && (numberInTheSequence != previousNumber) ) {
                    if( (isAscending && !isIncreasingOrder( previousNumber, numberInTheSequence )) ||
                            !isAscending && isIncreasingOrder(previousNumber, numberInTheSequence) ) {
                        shouldProcess = false;
                        isOrdered = false;
                    }
                }
                previousNumber = numberInTheSequence;
            }
            numberInTheSequence = scanner.nextInt();
            countOfNumbers++;
        }
        System.out.println(isOrdered);
    }
}