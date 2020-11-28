package instruments;

public class Guitar extends Instrument {
    private String make;
    private String model;
    private int numberOfStrings;

    public Guitar(String make, String model, String type, String colour, String material, int numberOfStrings) {
        super(type, colour, material);
        this.make = make;
        this.model = model;
        this.numberOfStrings = numberOfStrings;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Kerrrraaang!";
    }
}
