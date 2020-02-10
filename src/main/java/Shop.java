import behaviour.ISell;
import instruments.Recorder;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> inventory;
    private double till;

    public Shop() {
        this.inventory = new ArrayList<ISell>();
        this.till = 0;
    }

    public ArrayList<ISell> getInventory() {
        return inventory;
    }

    public double getTill() {
        return till;
    }

    public int countInventory(){
        return this.inventory.size();
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addInventory(ISell item) {
        this.inventory.add(item);
    }

    public void removeInventory(int index) {
        this.inventory.remove(index);
    }

    public double calculatePotentialProfit() {
        double total = 0;
        for(ISell item : inventory){
            total += item.calculateMarkUp();
        }
        return total;
    }

    public void buyItem(ISell item) {
        addInventory(item);
        removeMoneyfromTill(item);
    }

    private void removeMoneyfromTill(ISell item) {
        double price = item.getBuyPrice();
        this.till -= price;
    }


}
