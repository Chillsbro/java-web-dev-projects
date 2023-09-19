package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD Illmatic = new CD(350, 600, 450, "Illmatic", "1992", 60);
        Illmatic.spin();
        Illmatic.storeData();
        Illmatic.writeData(700, "Numb by linkin park");
        Illmatic.readData();
        Illmatic.reportData();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}