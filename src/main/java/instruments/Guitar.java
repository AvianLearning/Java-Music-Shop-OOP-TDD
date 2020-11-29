package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String description, double buyingPrice, double retailPrice, String type, String colour, String material, String make, String model, int numberOfStrings) {
        super(description, buyingPrice, retailPrice, type, colour, material, make, model);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Kerrrraaang!";
    }

    public double calculateMarkup() {
        return super.getRetailPrice() - super.getBuyingPrice();
    }
}
