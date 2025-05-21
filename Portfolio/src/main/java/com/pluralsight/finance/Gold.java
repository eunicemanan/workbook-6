package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Item: " + getName() + "\nValue: $" + getValue() + "\nWeight: " + weight + "g";
    }

}