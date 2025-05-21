package com.pluralsight.finance;

import com.pluralsight.model.Valuable;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getValue(){
        return marketValue;
    }
}
