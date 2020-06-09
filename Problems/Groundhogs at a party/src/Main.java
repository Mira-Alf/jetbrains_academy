import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isPartySuccess = isWeekend ? ( numPeanutButterCups >=15 && numPeanutButterCups <= 25 ) :
                ( numPeanutButterCups >= 10 && numPeanutButterCups <= 20 );
        System.out.println( isPartySuccess );
    }
}