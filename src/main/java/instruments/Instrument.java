package instruments;

public abstract class Instrument {
    private String type;
    private String colour;
    private String material;

    public Instrument(String type, String colour, String material) {
        this.type = type;
        this.colour = colour;
        this.material = material;
    }
}
