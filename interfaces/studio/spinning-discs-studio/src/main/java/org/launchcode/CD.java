package org.launchcode;

public class CD extends Disc implements OpticalDisc {

    public CD(double extraStorage, double storageCapacity, double rpm, String title, String year, double runtime) {
        super(extraStorage, storageCapacity, rpm, title, year, runtime);
    }

    public CD(double storageCapacity, double rpm) { // ability to create "blank" discs.
        super(storageCapacity, rpm);
    }

    @Override
    public void spin() {
        System.out.println(this.getTitle() + " spins at a rate of " + this.getRpm() + " rpm");
    }

    @Override
    public void storeData() {
        System.out.println("This CD has " + getExtraStorage() + " mb's of extra data");
    }

    @Override
    public void writeData(double storage, String data) {
        // illmatic.writeData(300, "Numb by linkin park")
        // subtract the storage from addedStorage
        if (this.getExtraStorage() - storage >= 0) {
            double storageLeft = this.getExtraStorage() - storage;
            this.setAddedStorage(storageLeft);
            System.out.println(data + "was successfully written to the " + this.getTitle() + " CD.");
        } else {
            System.out.println("There is not enough space left on this CD for " + storage + " mb's of data. There is " +
                    "only " + this.getExtraStorage() + " available.");
        }


    }

    @Override
    public void readData() {
        this.setIsLoaded(true);
        System.out.println("CD is now loaded, " + "systems show: " + this.getIsLoaded() + ", please use report data method to see it's contents.");
    }

    @Override
    public void reportData() {
        System.out.println(this);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
