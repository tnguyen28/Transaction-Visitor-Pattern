import java.math.BigDecimal;

public class ShoppingCartImpl implements ShoppingCart{
    CurrencyFormat cf = new CurrencyFormat();
    @Override
    public double visit(Phones phone){
       double price = phone.getPrice();

        System.out.print(phone.getMM() + " : ");
        cf.displayMoney(price);
        return price;
    }

    @Override
    public double visit(Seafood seafood){
        double price = seafood.getPricePerPound() * seafood.getWeight();

        System.out.print(seafood.getWeight() + " pounds of " + seafood.getSeafoodType() + " : ");
        cf.displayMoney(price);

        return price;

    }
}
