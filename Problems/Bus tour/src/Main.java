import java.util.*;

public class Main {

    private int heightOfBus;
    private int numberOfBridges;
    private Scanner scanner = new Scanner( System.in );

    public void setBusHeightAndNumberOfBridges() {
        this.heightOfBus = scanner.nextInt();
        this.numberOfBridges = scanner.nextInt();
    }

    public void checkIfBusCrashes() {
        int crashBridge = -1;
        boolean crash = false;
        for( int i = 0; i < this.numberOfBridges; i++ ) {
            int heightOfBridge = scanner.nextInt();
            if( heightOfBridge <= this.heightOfBus && !crash ) {
                crashBridge = i+1;
                crash = true;
            }
        }
        if( crash == false )
            System.out.println("Will not crash");
        else
            System.out.println("Will crash on bridge "+crashBridge);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setBusHeightAndNumberOfBridges();
        main.checkIfBusCrashes();
    }
}