package stock;

public class GuitarPedal extends ForSale implements ISell {

    private String make;
    private String model;

    public GuitarPedal(String description, double buyingPrice, double retailPrice, String make, String model) {
        super(description, buyingPrice, retailPrice);
        this.make = make;
        this.model = model;
    }

    public double calculateMarkup() {
        return super.getRetailPrice() - super.getBuyingPrice();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
