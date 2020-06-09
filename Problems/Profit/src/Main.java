import java.math.BigDecimal;
import java.util.*;

public class Main {
    private BigDecimal principalAmount;
    private double interestRateInPercent;
    private BigDecimal finalAmountExpected;
    private Scanner scanner = new Scanner( System.in );

    public void setRateAndAmounts() {
        this.principalAmount = scanner.nextBigDecimal();
        this.interestRateInPercent = scanner.nextDouble();
        this.finalAmountExpected = scanner.nextBigDecimal();
    }

    public void calculateYearsExpected() {
        BigDecimal principal = this.principalAmount;
        int years = 0;
        while( principal.compareTo( this.finalAmountExpected ) == -1 ) {
            years++;
            BigDecimal interest = principal.multiply( new BigDecimal( interestRateInPercent/100.0 ) );
            principal = principal.add(interest);
        }
        System.out.println(years);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setRateAndAmounts();
        main.calculateYearsExpected();
    }
}