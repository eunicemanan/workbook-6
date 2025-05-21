package com.pluralsight;

import com.pluralsight.finance.Gold;
import com.pluralsight.finance.House;

public class Main {
    public static void main(String[] args) {
        Gold goldNecklace = new Gold("Gold Necklace", 1500.0, 75.0);
        Gold goldBar = new Gold("Gold Bar", 60000.0, 1000.0);

        System.out.println("\nItem: " + goldNecklace.getName());
        System.out.println("Value: $" + goldNecklace.getValue());
        System.out.println();

        System.out.println("Item: " + goldBar.getName());
        System.out.println("Value: $" + goldBar.getValue());
        System.out.println();

        House house1 = new House("Beach House", 1982,1800, 3, 950000);
        System.out.println("Item: " + house1.getName());
        System.out.println("Value: $" + house1.getValue());




    }
}
