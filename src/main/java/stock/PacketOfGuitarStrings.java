package stock;

import java.util.ArrayList;

public class PacketOfGuitarStrings extends ForSale implements ISell {

    private ArrayList<GuitarStringType> strings;
    public PacketOfGuitarStrings(String description, double buyingPrice, double retailPrice) {
        super(description, buyingPrice, retailPrice);
        this.strings = new ArrayList<GuitarStringType>();
    }

    public ArrayList<GuitarStringType> getStrings() {
        return strings;
    }

    public void addStrings(GuitarStringType guitarString) {
        this.strings.add(guitarString);
    }

    public double calculateMarkup() {
        return super.getRetailPrice() - super.getBuyingPrice();
    }
}
