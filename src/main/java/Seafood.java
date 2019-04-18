import java.math.BigDecimal;

public class Seafood implements Item{

    private double pricePerPound;
    private double weight;
    private String seafoodType;

    public Seafood(double pricePerPound, double weight, String seafoodType){
        this.pricePerPound = pricePerPound;
        this.seafoodType = seafoodType;
        this.weight = weight;
    }

    public double getPricePerPound(){
        return pricePerPound;
    }
    public double getWeight(){
        return weight;
    }
    public String getSeafoodType(){
        return seafoodType;
    }

    @Override
    public double transact(ShoppingCart visitor) {
        return visitor.visit(this);
    }

}
