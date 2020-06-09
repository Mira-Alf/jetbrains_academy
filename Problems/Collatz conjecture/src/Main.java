import java.util.Scanner;

class Main {
    private int collatzBegin;
    private Scanner scanner = new Scanner(System.in);

    public void setCollatzBegin() {
        this.collatzBegin = scanner.nextInt();
    }

    public void generateCollatzSequence() {
        int result = this.collatzBegin;
        while( result != 1 ) {
            System.out.print( result + "\t" );
            if( result % 2 == 0 )
                result = result/2;
            else
                result = result*3 + 1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setCollatzBegin();
        main.generateCollatzSequence();
    }
}