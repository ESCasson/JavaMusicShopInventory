package instruments;

import behaviour.IPlay;
import behaviour.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int numberOfStrings;
    private boolean isAcoustic;
    private boolean isElectric;
    private RangeType rangeType;

    public Guitar(String make, String model, String description, MaterialType material, String colour,
                  InstrumentType type, double buyPrice, int numberOfStrings, boolean isAcoustic, boolean isElectric,
                  RangeType rangeType) {
        super(make, model, description, material, colour, type, buyPrice);
        this.numberOfStrings = numberOfStrings;
        this.isAcoustic = isAcoustic;
        this.isElectric = isElectric;
        this.rangeType = rangeType;

        changeSellPrice(1.5);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public RangeType getRangeType() {
        return rangeType;
    }


    public String play() {
        return "Twang";
    }


    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }

    public void changeSellPrice(double margin) {
        double newSellPrice = getBuyPrice()*margin;
        setSellPrice(newSellPrice);
    }
}
