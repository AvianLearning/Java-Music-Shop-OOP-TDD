package instruments;

import stock.ForSale;

public abstract class Instrument extends ForSale implements IPlay {
    private String type;
    private String colour;
    private String material;
    private String make;
    private String model;

    public Instrument(String description, double buyingPrice, double retailPrice, String type, String colour, String material, String make, String model) {
        super(description, buyingPrice, retailPrice);
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.make = make;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
