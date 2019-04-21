import java.math.BigDecimal;

public class ShoppingCartClient {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Phones(100.12, "iPhone 6s"),
                new Phones(300.34,"Samsung Galaxy 3"),
                new Seafood(12.12, 3, "Crab"),
                new Seafood(5.55, 10, "Crayfish")
        };

        calculateTotalPrice(items);

    }

    public static void calculateTotalPrice(Item[] items){
        ShoppingCart visitor = new ShoppingCartImpl();
        double total = 0;

        for(Item item : items){
            total = total + item.transact(visitor);
        }

        CurrencyFormat cf = new CurrencyFormat();

        System.out.print("Total: ");
        cf.displayMoney(total);

    }
}
