package instruments;

public class Synthesizer extends Instrument {

    private int numberOfKeys;

    public Synthesizer(String description, double buyingPrice, double retailPrice, String type, String colour, String material, String make, String model, int numberOfKeys) {
        super(description, buyingPrice, retailPrice, type, colour, material, make, model);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Squelch, whirrr, beep beep whooshhhhh";
    }

    public double calculateMarkup() {
        return super.getRetailPrice() - super.getBuyingPrice();
    }
}
