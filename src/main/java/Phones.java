import java.math.BigDecimal;

public class Phones implements Item{

    private double price;
    private String makeModel;

    public Phones(double price, String makeModel){
        this.price = price;
        this.makeModel = makeModel;
    }

    public double getPrice(){
        return price;
    }
    public String getMM(){
        return makeModel;
    }

    @Override
    public double transact(ShoppingCart visitor){
        return visitor.visit(this);
    }
}
