package stock;

public class SheetMusic extends ForSale implements ISell {

    private String title;
    private String publisher;

    public SheetMusic(String description, double buyingPrice, double retailPrice, String title, String publisher) {
        super(description, buyingPrice, retailPrice);
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public double calculateMarkup() {
        return super.getRetailPrice() - super.getBuyingPrice();
    }
}
