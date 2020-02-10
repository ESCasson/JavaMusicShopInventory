package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Recorder extends Instrument implements IPlay, ISell {

    private String range;

    public Recorder(String make, String model, String description, MaterialType material, String colour, InstrumentType type, double buyPrice, String range) {
        super(make, model, description, material, colour, type, buyPrice);
        this.range = range;

        changeSellPrice(1.5);
    }

    public String play() {
        return "toot toot";
    }

    public double calculateMarkUp() {
        return getSellPrice()-getBuyPrice();
    }

    public void changeSellPrice(double margin) {
        double newSellPrice = getBuyPrice()*margin;
        setSellPrice(newSellPrice);
    }

    public String getRange(){
        return this.range;
    };
}
