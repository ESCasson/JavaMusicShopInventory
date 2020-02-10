package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {
    private int numberOfOctaves;

    public Keyboard(String make, String model, String description, MaterialType material, String colour, InstrumentType type, double buyPrice, int numberOfOctaves) {
        super(make, model, description, material, colour, type, buyPrice);
        this.numberOfOctaves = numberOfOctaves;

        changeSellPrice(1.5);
    }

    public int getNumberOfOctaves() {
        return numberOfOctaves;
    }


    public String play() {
        return "Plinky Plonky";
    }

    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }

    public void changeSellPrice(double margin) {
        double newSellPrice = getBuyPrice() * margin;
        setSellPrice(newSellPrice);
    }
}
