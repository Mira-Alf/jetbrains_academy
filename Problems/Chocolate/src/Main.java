import java.util.Scanner;

class Main {
    private int[] segments = new int[3];
    private Scanner scanner = new Scanner(System.in);
    public void setInputs() {
        int numberOfInputs = 0;
        do {
            segments[numberOfInputs] = scanner.nextInt();
            numberOfInputs++;
        } while( numberOfInputs < 3 );
    }

    public boolean testIfPossibleToBreak() {
        if( segments[2] % segments[0] == 0 ) {
            return segments[2]/segments[0] <= segments[1];
        } else if(segments[2] % segments[1] == 0) {
            return segments[2] / segments[1] <= segments[0];
        } else
            return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setInputs();
        System.out.println(main.testIfPossibleToBreak() ? "YES" : "NO" );
    }
}