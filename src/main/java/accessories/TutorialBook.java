package accessories;

import behaviour.ISell;

public class TutorialBook extends Accessory implements ISell {
    private String title;
    private String author;
    private String publisher;
    private LevelType level;
    private GenreType genre;

    public TutorialBook(double buyPrice, String description, String title, String author, String publisher, LevelType level, GenreType genre) {
        super(buyPrice, description);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.level = level;
        this.genre = genre;

        changeSellPrice(1.5);
    }

    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }

    public void changeSellPrice(double margin) {
        double newSellPrice = getBuyPrice()*margin;
        setSellPrice(newSellPrice);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LevelType getLevel() {
        return level;
    }

    public GenreType getGenre() {
        return genre;
    }
}
