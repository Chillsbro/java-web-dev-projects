package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD Illmatic = new CD(600, 450, "Illmatic", "1992", 60);
        Illmatic.spin();
        Illmatic.storeData();
        Illmatic.writeData(700, "Numb by linkin park");
        Illmatic.readData();
        Illmatic.reportData();
        DVD TheyLive = new DVD(1000, 500, "They Live", "1988", 97);
        System.out.println(TheyLive);
        VinylRecord HousesOfTheHoly = new VinylRecord(350, "Houses of the Holy", "1973", 40);
        System.out.println(HousesOfTheHoly.spin());
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}