import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while(i != 0) {
            if( (i & 0x1) == 1 ) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
            i = scanner.nextInt();
        }
    }
}