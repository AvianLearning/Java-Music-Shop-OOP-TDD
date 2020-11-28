package instruments;

public class Xylophone extends Instrument {
    private int numberOfBars;

    public Xylophone(String type, String colour, String material, String make, String model, int numberOfBars) {
        super(type, colour, material, make, model);
        this.numberOfBars = numberOfBars;
    }

    public int getNumberOfBars() {
        return numberOfBars;
    }

    public String play() {
        return "Plinkety plinkety plonk plonk";
    }
}
