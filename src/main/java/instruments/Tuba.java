package instruments;

public class Tuba extends Instrument {
    private int numberOfValves;

    public Tuba(String description, double buyingPrice, double retailPrice, String type, String colour, String material, String make, String model, int numberOfValves) {
        super(description, buyingPrice, retailPrice, type, colour, material, make, model);
        this.numberOfValves = numberOfValves;
    }


    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Pum pum pum pumpedy rum pum pum";
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return 0;
    }
}
