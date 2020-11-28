package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String type, String colour, String material, String make, String model, int numberOfStrings) {
        super(type, colour, material, make, model);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Kerrrraaang!";
    }
}
