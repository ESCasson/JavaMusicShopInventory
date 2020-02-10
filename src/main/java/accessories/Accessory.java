package accessories;

public abstract class Accessory {
    private double buyPrice;
    private double sellPrice;
    private String description;

    public Accessory(double buyPrice, String description) {
        this.buyPrice = buyPrice;
        this.description = description;
        this.sellPrice = 0;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
