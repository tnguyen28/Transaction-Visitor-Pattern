import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public void displayMoney(double money) {
        BigDecimal createBD = new BigDecimal(money);
        BigDecimal displayBD = createBD.setScale(2, RoundingMode.HALF_EVEN);

        NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
        usdCostFormat.setMinimumFractionDigits( 1 );
        usdCostFormat.setMaximumFractionDigits( 2 );
        System.out.println( usdCostFormat.format(displayBD.doubleValue()));

    }
}
