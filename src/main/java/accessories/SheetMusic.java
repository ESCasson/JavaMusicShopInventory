package accessories;

import behaviour.ISell;

public class SheetMusic extends Accessory implements ISell {
    private String title;
    private String publisher;
    private GenreType genre;

    public SheetMusic(double buyPrice, String description, String title, String publisher, GenreType genre) {
        super(buyPrice, description);
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;

        changeSellPrice(1.5);
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public GenreType getGenre() {
        return genre;
    }

    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }

    public void changeSellPrice(double margin) {
        double newSellPrice = getBuyPrice()*margin;
        setSellPrice(newSellPrice);
    }
}
