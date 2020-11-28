package instruments;

public class Xylophone extends Instrument {
    private int numberOfBars;

    public Xylophone(String description, double buyingPrice, double retailPrice, String type, String colour, String material, String make, String model, int numberOfBars) {
        super(description, buyingPrice, retailPrice, type, colour, material, make, model);
        this.numberOfBars = numberOfBars;
    }


    public int getNumberOfBars() {
        return numberOfBars;
    }

    public String play() {
        return "Plinkety plinkety plonk plonk";
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return 0;
    }
}
