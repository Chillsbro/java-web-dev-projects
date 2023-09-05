package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem FrenchFries = new MenuItem(3.99, "crispy", "appetizer", true, "French Fries");
        MenuItem GermanFries = new MenuItem(3.99, "Juicy", "appetizer", false, "German Fries");
        MenuItem NorwegianFries = new MenuItem(3.99, "Flavor", "appetizer", true, "Norwegian Fries");
        ArrayList<MenuItem> Burgers = new ArrayList<>();
        Menu FiveGuys = new Menu("Five Guys", new Date(), Burgers);
        FiveGuys.addItem(FrenchFries);
        FiveGuys.addItem(GermanFries);
        FiveGuys.addItem(NorwegianFries);
//        for (MenuItem items : FiveGuys.getItems()) {
//            System.out.println(items.toString());
//        }
        System.out.println(FiveGuys.getItems());
        System.out.println(FrenchFries.toString());
        FiveGuys.removeItem(NorwegianFries);
        System.out.println(FiveGuys.getItems());
        System.out.println(FiveGuys.getLastUpdated());
        System.out.println(FrenchFries.getIsNew());
        System.out.println(FrenchFries.isEqual(NorwegianFries));

    }
}
