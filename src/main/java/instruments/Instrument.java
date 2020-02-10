package instruments;

public abstract class Instrument {
    private String make;
    private String model;
    private String description;
    private MaterialType material;
    private String colour;
    private InstrumentType type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String make, String model, String description, MaterialType material, String colour,
                      InstrumentType type, double buyPrice) {
        this.make = make;
        this.model = model;
        this.description = description;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = 0;

    }




    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }


}
