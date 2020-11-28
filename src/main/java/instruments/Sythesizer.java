package instruments;

public class Sythesizer extends Instrument {

    private int numberOfKeys;

    public Sythesizer(String type, String colour, String material, String make, String model, int numberOfKeys) {
        super(type, colour, material, make, model);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Squelch, whirrr, beep beep whooshhhhh";
    }
}
