package stock;

public abstract class ForSale implements ISell {
    private String description;
    private double buyingPrice;
    private double retailPrice;

    public ForSale(String description, double buyingPrice, double retailPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.retailPrice = retailPrice;
    }
}
